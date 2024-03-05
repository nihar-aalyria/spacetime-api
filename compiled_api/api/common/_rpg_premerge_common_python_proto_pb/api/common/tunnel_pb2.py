# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: api/common/tunnel.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17\x61pi/common/tunnel.proto\x12\x1c\x61\x61lyria.spacetime.api.common\x1a\x1bgoogle/protobuf/empty.proto\"\x93\x03\n\x0b\x45spProtocol\x12^\n\x0e\x61uthentication\x18\x01 \x01(\x0b\x32\x36.aalyria.spacetime.api.common.EspProtocol.EspIntegrityR\x0e\x61uthentication\x12T\n\nencryption\x18\x02 \x01(\x0b\x32\x34.aalyria.spacetime.api.common.EspProtocol.EspPrivacyR\nencryption\x1ai\n\x0c\x45spIntegrity\x12S\n\talgorithm\x18\x01 \x01(\x0e\x32\x35.aalyria.spacetime.api.common.AuthenticationAlgorithmR\talgorithmJ\x04\x08\x02\x10\x03\x1a\x63\n\nEspPrivacy\x12O\n\talgorithm\x18\x01 \x01(\x0e\x32\x31.aalyria.spacetime.api.common.EncryptionAlgorithmR\talgorithmJ\x04\x08\x02\x10\x03\"\xb9\x04\n\rEspParameters\x12:\n\x19security_parameters_index\x18\x03 \x01(\rR\x17securityParametersIndex\x12[\n\x0e\x61uthentication\x18\x01 \x01(\x0b\x32\x33.aalyria.spacetime.api.common.EspParameters.EspAuthR\x0e\x61uthentication\x12V\n\nencryption\x18\x02 \x01(\x0b\x32\x36.aalyria.spacetime.api.common.EspParameters.EspEncryptR\nencryption\x1a\x9a\x01\n\x07\x45spAuth\x12S\n\talgorithm\x18\x01 \x01(\x0e\x32\x35.aalyria.spacetime.api.common.AuthenticationAlgorithmR\talgorithm\x12:\n\x03key\x18\x02 \x01(\x0b\x32(.aalyria.spacetime.api.common.WrappedKeyR\x03key\x1a\x99\x01\n\nEspEncrypt\x12O\n\talgorithm\x18\x01 \x01(\x0e\x32\x31.aalyria.spacetime.api.common.EncryptionAlgorithmR\talgorithm\x12:\n\x03key\x18\x02 \x01(\x0b\x32(.aalyria.spacetime.api.common.WrappedKeyR\x03key\"[\n\nWrappedKey\x12,\n\x12unwrapper_key_name\x18\x01 \x01(\tR\x10unwrapperKeyName\x12\x1f\n\x0bwrapped_key\x18\x02 \x01(\x0cR\nwrappedKey\"\x91\x01\n\x0cTunnelMethod\x12=\n\x03\x65sp\x18\x01 \x01(\x0b\x32).aalyria.spacetime.api.common.EspProtocolH\x00R\x03\x65sp\x12,\n\x04none\x18\x02 \x01(\x0b\x32\x16.google.protobuf.EmptyH\x00R\x04noneB\n\n\x08protocolJ\x08\x08\x03\x10\x80\x80\x80\x80\x02*F\n\x17\x41uthenticationAlgorithm\x12\x19\n\x15\x41UTH_ALGO_UNSPECIFIED\x10\x00\x12\x10\n\x0cHMAC_SHA1_96\x10\x01*G\n\x13\x45ncryptionAlgorithm\x12\x1f\n\x1b\x45NCRYPTION_ALGO_UNSPECIFIED\x10\x00\x12\x0f\n\x0b\x41\x45S_CBC_128\x10\x01\x42\x44\n com.aalyria.spacetime.api.commonZ aalyria.com/spacetime/api/common')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'api.common.tunnel_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.aalyria.spacetime.api.commonZ aalyria.com/spacetime/api/common'
  _globals['_AUTHENTICATIONALGORITHM']._serialized_start=1305
  _globals['_AUTHENTICATIONALGORITHM']._serialized_end=1375
  _globals['_ENCRYPTIONALGORITHM']._serialized_start=1377
  _globals['_ENCRYPTIONALGORITHM']._serialized_end=1448
  _globals['_ESPPROTOCOL']._serialized_start=87
  _globals['_ESPPROTOCOL']._serialized_end=490
  _globals['_ESPPROTOCOL_ESPINTEGRITY']._serialized_start=284
  _globals['_ESPPROTOCOL_ESPINTEGRITY']._serialized_end=389
  _globals['_ESPPROTOCOL_ESPPRIVACY']._serialized_start=391
  _globals['_ESPPROTOCOL_ESPPRIVACY']._serialized_end=490
  _globals['_ESPPARAMETERS']._serialized_start=493
  _globals['_ESPPARAMETERS']._serialized_end=1062
  _globals['_ESPPARAMETERS_ESPAUTH']._serialized_start=752
  _globals['_ESPPARAMETERS_ESPAUTH']._serialized_end=906
  _globals['_ESPPARAMETERS_ESPENCRYPT']._serialized_start=909
  _globals['_ESPPARAMETERS_ESPENCRYPT']._serialized_end=1062
  _globals['_WRAPPEDKEY']._serialized_start=1064
  _globals['_WRAPPEDKEY']._serialized_end=1155
  _globals['_TUNNELMETHOD']._serialized_start=1158
  _globals['_TUNNELMETHOD']._serialized_end=1303
# @@protoc_insertion_point(module_scope)