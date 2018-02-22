(ns memefactory.server.contract.registry
  (:require [district.server.smart-contracts :refer [contract-call contract-event-in-tx]]))

(defn db [contract-key]
  (contract-call contract-key :db))

(defn construct [contract-key {:keys [:db]} & [opts]]
  (contract-call contract-key :construct db (merge opts {:gas 100000})))

(defn set-factory [contract-key {:keys [:factory :factory?]} & [opts]]
  (contract-call contract-key :set-factory factory factory? (merge opts {:gas 100000})))

(defn registry-entry-event [contract-key & args]
  (apply contract-call contract-key :RegistryEntryEvent args))

(defn registry-entry-event-in-tx [contract-key tx-hash & args]
  (apply contract-event-in-tx tx-hash contract-key :RegistryEntryEvent args))
