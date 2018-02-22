pragma solidity ^0.4.18;

import "RegistryEntry.sol";
import "db/EternalDb.sol";

contract ParameterChange is RegistryEntry {

  struct Change {
    bytes32 key;
    uint uintValue;
    EternalDb.Types valueType;
    bool wasApplied;
  }

  Change public change;

  function construct(
    uint _version,
    address _creator,
    bytes32 _key,
    uint _uintValue
  )
  public
  {
    super.construct(_version, _creator);
    change = Change(_key, _uintValue, EternalDb.Types.UInt, false);
  }

  function applyChange(EternalDb _db) public {
    _db.setUIntValue(change.key, change.uintValue);
    change.wasApplied = true;
    _db.transferOwnership(msg.sender);
  }

  function wasApplied() public constant returns (bool) {
    return change.wasApplied;
  }
}