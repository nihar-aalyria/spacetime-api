# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: api/cdpi/v1alpha/cdpi.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from api.common import control_pb2 as api_dot_common_dot_control__pb2
from api.common import coordinates_pb2 as api_dot_common_dot_coordinates__pb2
from api.common import telemetry_pb2 as api_dot_common_dot_telemetry__pb2
from api.common import wireless_propagation_pb2 as api_dot_common_dot_wireless__propagation__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x61pi/cdpi/v1alpha/cdpi.proto\x12\"aalyria.spacetime.api.cdpi.v1alpha\x1a\x18\x61pi/common/control.proto\x1a\x1c\x61pi/common/coordinates.proto\x1a\x1a\x61pi/common/telemetry.proto\x1a%api/common/wireless_propagation.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\")\n\x17\x43ontrolPlanePingRequest\x12\x0e\n\x02id\x18\x01 \x01(\x03R\x02id\"\x9a\x01\n\x18\x43ontrolPlanePingResponse\x12\x0e\n\x02id\x18\x01 \x01(\x03R\x02id\x12*\n\x06status\x18\x03 \x01(\x0b\x32\x12.google.rpc.StatusR\x06status\x12\x42\n\x0ftime_of_receipt\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\rtimeOfReceipt\"\xeb\x02\n\x19\x43ontrolStateChangeRequest\x12\x61\n\x10scheduled_update\x18\x01 \x01(\x0b\x32\x34.aalyria.spacetime.api.common.ScheduledControlUpdateH\x00R\x0fscheduledUpdate\x12g\n\x12scheduled_deletion\x18\x02 \x01(\x0b\x32\x36.aalyria.spacetime.api.common.ScheduledControlDeletionH\x00R\x11scheduledDeletion\x12z\n\x1a\x63ontrol_plane_ping_request\x18\x03 \x01(\x0b\x32;.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingRequestH\x00R\x17\x63ontrolPlanePingRequestB\x06\n\x04type\"\xee\x02\n\x18\x43ontrolStateNotification\x12\x17\n\x07node_id\x18\x01 \x01(\tR\x06nodeId\x12V\n\x08statuses\x18\x02 \x03(\x0b\x32:.aalyria.spacetime.api.common.ScheduledControlUpdateStatusR\x08statuses\x12\x45\n\x05state\x18\x03 \x01(\x0b\x32/.aalyria.spacetime.api.common.ControlPlaneStateR\x05state\x12\x1d\n\x08priority\x18\x04 \x01(\r:\x01\x30R\x08priority\x12{\n\x1b\x63ontrol_plane_ping_response\x18\x05 \x01(\x0b\x32<.aalyria.spacetime.api.cdpi.v1alpha.ControlPlanePingResponseR\x18\x63ontrolPlanePingResponse\"\xb7\x01\n\x10TelemetryRequest\x12\x17\n\x07node_id\x18\x01 \x01(\tR\x06nodeId\x12\x43\n\x10query_statistics\x18\x02 \x01(\x0b\x32\x16.google.protobuf.EmptyH\x00R\x0fqueryStatistics\x12=\n\x1astatistics_publish_rate_hz\x18\x03 \x01(\x01H\x00R\x17statisticsPublishRateHzB\x06\n\x04type\"\xd4\x01\n\x0fTelemetryUpdate\x12\x1b\n\x07node_id\x18\x01 \x01(\tB\x02\x18\x01R\x06nodeId\x12R\n\nstatistics\x18\x02 \x01(\x0b\x32\x30.aalyria.spacetime.api.common.NetworkStatsReportH\x00R\nstatistics\x12H\n\x05\x65vent\x18\x03 \x01(\x0b\x32\x30.aalyria.spacetime.api.common.NetworkEventReportH\x00R\x05\x65ventB\x06\n\x04type\"\xc8\x01\n\x11SensorWeatherData\x12G\n\x08location\x18\x04 \x01(\x0b\x32+.aalyria.spacetime.api.common.GeodeticWgs84R\x08location\x12T\n\x0cweather_data\x18\x03 \x01(\x0b\x32\x31.aalyria.spacetime.api.common.WeatherDataForecastR\x0bweatherDataJ\x04\x08\x01\x10\x02J\x04\x08\x02\x10\x03J\x08\x08\x05\x10\x80\x80\x80\x80\x02\"v\n\x14\x43\x64piNodeStateRequest\x12\x17\n\x07node_id\x18\x01 \x01(\tR\x06nodeId\x12\x45\n\x05state\x18\x03 \x01(\x0b\x32/.aalyria.spacetime.api.common.ControlPlaneStateR\x05state\"\x87\x01\n\x18\x43\x64piRequestStatusRequest\x12\x17\n\x07node_id\x18\x01 \x01(\tR\x06nodeId\x12R\n\x06status\x18\x02 \x01(\x0b\x32:.aalyria.spacetime.api.common.ScheduledControlUpdateStatusR\x06status\"\xee\x02\n\x0b\x43\x64piRequest\x12K\n\x05hello\x18\x01 \x01(\x0b\x32\x35.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest.HelloR\x05hello\x12T\n\x08response\x18\x02 \x01(\x0b\x32\x38.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest.ResponseR\x08response\x1aK\n\x05Hello\x12\x17\n\x07node_id\x18\x01 \x01(\tR\x06nodeId\x12)\n\x10\x63hannel_priority\x18\x02 \x01(\rR\x0f\x63hannelPriority\x1ao\n\x08Response\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\x12*\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.StatusR\x06status\x12\x18\n\x07payload\x18\x03 \x01(\x0cR\x07payload\"V\n\x0c\x43\x64piResponse\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\x12\'\n\x0frequest_payload\x18\x02 \x01(\x0cR\x0erequestPayload2\xb9\x01\n\x1aNetworkControllerStreaming\x12\x9a\x01\n\x15\x43ontrolPlaneInterface\x12<.aalyria.spacetime.api.cdpi.v1alpha.ControlStateNotification\x1a=.aalyria.spacetime.api.cdpi.v1alpha.ControlStateChangeRequest\"\x00(\x01\x30\x01\x32\xa3\x01\n\x19NetworkTelemetryStreaming\x12\x85\x01\n\x12TelemetryInterface\x12\x33.aalyria.spacetime.api.cdpi.v1alpha.TelemetryUpdate\x1a\x34.aalyria.spacetime.api.cdpi.v1alpha.TelemetryRequest\"\x00(\x01\x30\x01\x32}\n\x16\x41ttenuationEnvironment\x12\x63\n\x10UploadSensorData\x12\x35.aalyria.spacetime.api.cdpi.v1alpha.SensorWeatherData\x1a\x16.google.protobuf.Empty\"\x00\x32\xcd\x02\n\x04\x43\x64pi\x12o\n\x04\x43\x64pi\x12/.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequest\x1a\x30.aalyria.spacetime.api.cdpi.v1alpha.CdpiResponse\"\x00(\x01\x30\x01\x12\x65\n\x0fUpdateNodeState\x12\x38.aalyria.spacetime.api.cdpi.v1alpha.CdpiNodeStateRequest\x1a\x16.google.protobuf.Empty\"\x00\x12m\n\x13UpdateRequestStatus\x12<.aalyria.spacetime.api.cdpi.v1alpha.CdpiRequestStatusRequest\x1a\x16.google.protobuf.Empty\"\x00\x42]\n&com.aalyria.spacetime.api.cdpi.v1alphaB\tCdpiProtoP\x01Z&aalyria.com/spacetime/api/cdpi/v1alpha')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'api.cdpi.v1alpha.cdpi_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.aalyria.spacetime.api.cdpi.v1alphaB\tCdpiProtoP\001Z&aalyria.com/spacetime/api/cdpi/v1alpha'
  _TELEMETRYUPDATE.fields_by_name['node_id']._options = None
  _TELEMETRYUPDATE.fields_by_name['node_id']._serialized_options = b'\030\001'
  _globals['_CONTROLPLANEPINGREQUEST']._serialized_start=277
  _globals['_CONTROLPLANEPINGREQUEST']._serialized_end=318
  _globals['_CONTROLPLANEPINGRESPONSE']._serialized_start=321
  _globals['_CONTROLPLANEPINGRESPONSE']._serialized_end=475
  _globals['_CONTROLSTATECHANGEREQUEST']._serialized_start=478
  _globals['_CONTROLSTATECHANGEREQUEST']._serialized_end=841
  _globals['_CONTROLSTATENOTIFICATION']._serialized_start=844
  _globals['_CONTROLSTATENOTIFICATION']._serialized_end=1210
  _globals['_TELEMETRYREQUEST']._serialized_start=1213
  _globals['_TELEMETRYREQUEST']._serialized_end=1396
  _globals['_TELEMETRYUPDATE']._serialized_start=1399
  _globals['_TELEMETRYUPDATE']._serialized_end=1611
  _globals['_SENSORWEATHERDATA']._serialized_start=1614
  _globals['_SENSORWEATHERDATA']._serialized_end=1814
  _globals['_CDPINODESTATEREQUEST']._serialized_start=1816
  _globals['_CDPINODESTATEREQUEST']._serialized_end=1934
  _globals['_CDPIREQUESTSTATUSREQUEST']._serialized_start=1937
  _globals['_CDPIREQUESTSTATUSREQUEST']._serialized_end=2072
  _globals['_CDPIREQUEST']._serialized_start=2075
  _globals['_CDPIREQUEST']._serialized_end=2441
  _globals['_CDPIREQUEST_HELLO']._serialized_start=2253
  _globals['_CDPIREQUEST_HELLO']._serialized_end=2328
  _globals['_CDPIREQUEST_RESPONSE']._serialized_start=2330
  _globals['_CDPIREQUEST_RESPONSE']._serialized_end=2441
  _globals['_CDPIRESPONSE']._serialized_start=2443
  _globals['_CDPIRESPONSE']._serialized_end=2529
  _globals['_NETWORKCONTROLLERSTREAMING']._serialized_start=2532
  _globals['_NETWORKCONTROLLERSTREAMING']._serialized_end=2717
  _globals['_NETWORKTELEMETRYSTREAMING']._serialized_start=2720
  _globals['_NETWORKTELEMETRYSTREAMING']._serialized_end=2883
  _globals['_ATTENUATIONENVIRONMENT']._serialized_start=2885
  _globals['_ATTENUATIONENVIRONMENT']._serialized_end=3010
  _globals['_CDPI']._serialized_start=3013
  _globals['_CDPI']._serialized_end=3346
# @@protoc_insertion_point(module_scope)