(ns memefactory.shared.smart-contracts-qa)

(def smart-contracts
  {:district-config
   {:name "DistrictConfig"
    :address "0xc0631861f334e80e960da6317f8b66a122b32e71"}
   :dank-faucet
   {:name "DankFaucet"
    :address "0xd985567526994b5c46d0c2fc165c3d1c0136e813"}
   :ds-guard
   {:name "DSGuard"
    :address "0xab4d684b2cc21ea99ee560a0f0d1490b09b09127"}
   :param-change-registry
   {:name "ParamChangeRegistry"
    :address "0x594d03feacd51360d4b57d528f183aafd1c661db"}
   :param-change-registry-db
   {:name "EternalDb"
    :address "0x8e27158eb1177b01bb4f0303c2b21ca785a55352"}
   :meme-registry-db
   {:name "EternalDb"
    :address "0x4450bcc33af0b93362fff45e957092b3d5371fe5"}
   :param-change
   {:name "ParamChange"
    :address "0x92f750fdbc31c49d30d5bc93ab421cc1b6f31b82"}
   :minime-token-factory
   {:name "MiniMeTokenFactory"
    :address "0xa0a24fcac66bf51b2366686916e248c13a5641b1"}
   :meme-auction-factory
   {:name "MemeAuctionFactory"
    :address "0x51b786305b341f332538e74498e6d1e97b2b75d0"}
   :meme-auction
   {:name "MemeAuction"
    :address "0x57d3bd03852f7f7c40778b433f307e5d653379b9"}
   :param-change-factory
   {:name "ParamChangeFactory"
    :address "0xe6138e163908e7dce5ea1957bb27a89471516a3e"}
   :param-change-registry-fwd
   {:name "MutableForwarder"
    :address "0x5091c87601b085d5abb477a534bcac80fd11896e"
    :forwards-to :param-change-registry}
   :meme-factory
   {:name "MemeFactory"
    :address "0xa04d5724c3afb5445e5cdd30239fc7a5ce20df02"}
   :meme-token
   {:name "MemeToken"
    :address "0xed6c2bc38762a25ef9d2c3ea2aea417eba12f9b1"}
   :DANK
   {:name "DankToken"
    :address "0xeda9bf9199fab6790f43ee21cdce048781f58302"}
   :meme-registry
   {:name "Registry"
    :address "0xc709ef0d5a4161bb644d52107e9d1eb06fbf986e"}
   :meme
   {:name "Meme"
    :address "0xd04e717b8cc5cc4355df83d8e078e8b59dee4e4c"}
   :meme-registry-fwd
   {:name "MutableForwarder"
    :address "0x4bc9e58e3dc6eb4dfdb783554bb2341ba160657b"
    :forwards-to :meme-registry}
   :migrations
   {:name "Migrations"
    :address "0x64fd6cee0d8134458407c357ea04ffbfb5421fc1"}
   :district0x-emails
   {:name "District0xEmails"
    :address "0x3e6e8cdac0abab167644811b331594a500e8df7f"}
   :meme-auction-factory-fwd
   {:name "MutableForwarder"
    :address "0xebe667d6b34e34920db1b5faf85f23ae6f003b9c"
    :forwards-to :meme-auction-factory}})
