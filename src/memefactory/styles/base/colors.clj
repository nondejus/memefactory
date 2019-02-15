(ns memefactory.styles.base.colors)

(def names->colors {:pink "#ff0094"
                    :sky-blue "#04b7e0"
                    :dark-blue "#362edb"
                    :darker-blue "#34588B"
                    :light-pink "#e1b4ef"
                    :purple "#9d0adb"
                    :deep-purple "#2e0248"
                    :blue "#00bae2"
                    :light-light-grey "#f8f9fd"
                    :ticker-background "#ff0090"
                    :ticker-color "#FFFFFF"
                    :ticker-token-color "#ff80c8"
                    :section-caption "#ff0090"
                    :section-subcaption "#47608e"
                    :border-line "#eff1f5"
                    :search-input-bg "#f2f4fb"
                    :menu-logo "#ff0090"
                    :menu-text "#47608e"
                    :menu-text-hover "#5b6d8e"
                    :main-content-bg "#f2f4fb"
                    :header-sub-title "#8194b2"
                    :meme-panel-bg "#FFFFFF"
                    :meme-bg "rgba(73,35,86,.85)"
                    :meme-bg-bottom "#9d0adb"
                    :meme-buy-button "#2f0149"
                    :meme-buy-button-text "white"
                    :meme-info-text "white"
                    :meme-tile-footer "#47608e"
                    :new-meme-icon-bg "#FF0090"
                    :rare-meme-icon-bg "#1ff2c8"
                    :random-meme-icon-bg "#ffcc00"
                    :mymemefolio-green "#29d401"
                    :light-green "#DCFDD2"
                    :violet "#2e1f37"
                    :light-violet "rgba(116,100,126,.15)"
                    :light-grey "rgba(255,255,255,.7)"
                    :tags-grey "#eff5ff"
                    :curator-card-bg "#f2f4fb"
                    :leaderboard-curator-bg "#9cc717"
                    :table-header-bg "#ffd200"
                    :table-border "#e1b4ef"
                    :table-border-1 "#e2dee4"
                    :busy-grey "#5c5c5c"
                    :rank-yellow "#ffd800"
                    :yellow "#ffea00"
                    :cancel-button "#d0e5e8"
                    :redish "#f25e5e"
                    })

(defn color [name]
  (get names->colors name name))
