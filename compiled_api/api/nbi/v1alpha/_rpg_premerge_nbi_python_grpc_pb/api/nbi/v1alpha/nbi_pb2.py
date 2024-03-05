# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: api/nbi/v1alpha/nbi.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from api.common import channel_pb2 as api_dot_common_dot_channel__pb2
from api.common import control_pb2 as api_dot_common_dot_control__pb2
from api.common import coordinates_pb2 as api_dot_common_dot_coordinates__pb2
from api.common import platform_pb2 as api_dot_common_dot_platform__pb2
from api.common import telemetry_pb2 as api_dot_common_dot_telemetry__pb2
from api.common import time_pb2 as api_dot_common_dot_time__pb2
from api.nbi.v1alpha.resources import antenna_pattern_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_antenna__pattern__pb2
from api.nbi.v1alpha.resources import coverage_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_coverage__pb2
from api.nbi.v1alpha.resources import devices_in_region_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_devices__in__region__pb2
from api.nbi.v1alpha.resources import intent_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_intent__pb2
from api.nbi.v1alpha.resources import motion_evaluation_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_motion__evaluation__pb2
from api.nbi.v1alpha.resources import network_element_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_network__element__pb2
from api.nbi.v1alpha.resources import network_link_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_network__link__pb2
from api.nbi.v1alpha.resources import scenario_settings_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_scenario__settings__pb2
from api.nbi.v1alpha.resources import service_request_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_service__request__pb2
from api.nbi.v1alpha.resources import wireless_interference_pb2 as api_dot_nbi_dot_v1alpha_dot_resources_dot_wireless__interference__pb2
from google.type import interval_pb2 as google_dot_type_dot_interval__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x61pi/nbi/v1alpha/nbi.proto\x12!aalyria.spacetime.api.nbi.v1alpha\x1a\x18\x61pi/common/channel.proto\x1a\x18\x61pi/common/control.proto\x1a\x1c\x61pi/common/coordinates.proto\x1a\x19\x61pi/common/platform.proto\x1a\x1a\x61pi/common/telemetry.proto\x1a\x15\x61pi/common/time.proto\x1a/api/nbi/v1alpha/resources/antenna_pattern.proto\x1a(api/nbi/v1alpha/resources/coverage.proto\x1a\x31\x61pi/nbi/v1alpha/resources/devices_in_region.proto\x1a&api/nbi/v1alpha/resources/intent.proto\x1a\x31\x61pi/nbi/v1alpha/resources/motion_evaluation.proto\x1a/api/nbi/v1alpha/resources/network_element.proto\x1a,api/nbi/v1alpha/resources/network_link.proto\x1a\x31\x61pi/nbi/v1alpha/resources/scenario_settings.proto\x1a/api/nbi/v1alpha/resources/service_request.proto\x1a\x35\x61pi/nbi/v1alpha/resources/wireless_interference.proto\x1a\x1agoogle/type/interval.proto\"g\n\x0b\x45ntityGroup\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.aalyria.spacetime.api.nbi.v1alpha.EntityTypeR\x04type\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\tR\x05\x61ppId\"=\n\x0eResourceOrigin\x12+\n\x11provider_endpoint\x18\x01 \x01(\tR\x10providerEndpoint\"\x8c\x10\n\x06\x45ntity\x12\x44\n\x05group\x18\x01 \x01(\x0b\x32..aalyria.spacetime.api.nbi.v1alpha.EntityGroupR\x05group\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12Z\n\x0fresource_origin\x18\" \x01(\x0b\x32\x31.aalyria.spacetime.api.nbi.v1alpha.ResourceOriginR\x0eresourceOrigin\x12)\n\x10\x63ommit_timestamp\x18\x03 \x01(\x03R\x0f\x63ommitTimestamp\x12\x32\n\x15next_commit_timestamp\x18! \x01(\x03R\x13nextCommitTimestamp\x12(\n\x10last_modified_by\x18\x16 \x01(\tR\x0elastModifiedBy\x12\x66\n\x0f\x61ntenna_pattern\x18\x0f \x01(\x0b\x32;.aalyria.spacetime.api.nbi.v1alpha.resources.AntennaPatternH\x00R\x0e\x61ntennaPattern\x12N\n\x0c\x62\x61nd_profile\x18\x14 \x01(\x0b\x32).aalyria.spacetime.api.common.BandProfileH\x00R\x0b\x62\x61ndProfile\x12X\n\x10\x63\x64pi_stream_info\x18\x17 \x01(\x0b\x32,.aalyria.spacetime.api.common.CdpiStreamInfoH\x00R\x0e\x63\x64piStreamInfo\x12\x66\n\x0f\x63omputed_motion\x18\n \x01(\x0b\x32;.aalyria.spacetime.api.nbi.v1alpha.resources.ComputedMotionH\x00R\x0e\x63omputedMotion\x12j\n\x11\x64\x65vices_in_region\x18\x1e \x01(\x0b\x32<.aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegionH\x00R\x0f\x64\x65vicesInRegion\x12Z\n\x0bstation_set\x18\x1b \x01(\x0b\x32\x37.aalyria.spacetime.api.nbi.v1alpha.resources.StationSetH\x00R\nstationSet\x12\x63\n\x0esurface_region\x18\x1c \x01(\x0b\x32:.aalyria.spacetime.api.nbi.v1alpha.resources.SurfaceRegionH\x00R\rsurfaceRegion\x12\x66\n\x0f\x64rain_provision\x18\x1a \x01(\x0b\x32;.aalyria.spacetime.api.nbi.v1alpha.resources.DrainProvisionH\x00R\x0e\x64rainProvision\x12M\n\x06intent\x18\t \x01(\x0b\x32\x33.aalyria.spacetime.api.nbi.v1alpha.resources.IntentH\x00R\x06intent\x12v\n\x15interface_link_report\x18\x08 \x01(\x0b\x32@.aalyria.spacetime.api.nbi.v1alpha.resources.InterfaceLinkReportH\x00R\x13interfaceLinkReport\x12~\n\x17interference_constraint\x18\x1d \x01(\x0b\x32\x43.aalyria.spacetime.api.nbi.v1alpha.resources.InterferenceConstraintH\x00R\x16interferenceConstraint\x12]\n\x11motion_definition\x18\x07 \x01(\x0b\x32..aalyria.spacetime.api.common.MotionDefinitionH\x00R\x10motionDefinition\x12]\n\x0cnetwork_node\x18\x06 \x01(\x0b\x32\x38.aalyria.spacetime.api.nbi.v1alpha.resources.NetworkNodeH\x00R\x0bnetworkNode\x12\x64\n\x14network_stats_report\x18\x0b \x01(\x0b\x32\x30.aalyria.spacetime.api.common.NetworkStatsReportH\x00R\x12networkStatsReport\x12N\n\x08platform\x18\x04 \x01(\x0b\x32\x30.aalyria.spacetime.api.common.PlatformDefinitionH\x00R\x08platform\x12\x66\n\x0fservice_request\x18\x05 \x01(\x0b\x32;.aalyria.spacetime.api.nbi.v1alpha.resources.ServiceRequestH\x00R\x0eserviceRequest\x12|\n\x17transceiver_link_report\x18\x19 \x01(\x0b\x32\x42.aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverLinkReportH\x00R\x15transceiverLinkReportB\x07\n\x05valueJ\x04\x08\x12\x10\x13J\x08\x08#\x10\x80\x80\x80\x80\x02\"e\n\x10GetEntityRequest\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.aalyria.spacetime.api.nbi.v1alpha.EntityTypeR\x04type\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\"X\n\x13\x43reateEntityRequest\x12\x41\n\x06\x65ntity\x18\x01 \x01(\x0b\x32).aalyria.spacetime.api.nbi.v1alpha.EntityR\x06\x65ntity\"\x92\x01\n\x13UpdateEntityRequest\x12\x41\n\x06\x65ntity\x18\x01 \x01(\x0b\x32).aalyria.spacetime.api.nbi.v1alpha.EntityR\x06\x65ntity\x12\x38\n\x18ignore_consistency_check\x18\x02 \x01(\x08R\x16ignoreConsistencyCheck\"\xa8\x02\n\x13ListEntitiesRequest\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.aalyria.spacetime.api.nbi.v1alpha.EntityTypeR\x04type\x12\x31\n\x08interval\x18\x03 \x01(\x0b\x32\x15.google.type.IntervalR\x08interval\x12G\n\x06\x66ilter\x18\x05 \x01(\x0b\x32/.aalyria.spacetime.api.nbi.v1alpha.EntityFilterR\x06\x66ilter\x12\x42\n\x1d\x63ompute_cartesian_coordinates\x18\x06 \x01(\x08R\x1b\x63omputeCartesianCoordinatesJ\x04\x08\x02\x10\x03J\x08\x08\x07\x10\x80\x80\x80\x80\x02\"]\n\x14ListEntitiesResponse\x12\x45\n\x08\x65ntities\x18\x01 \x03(\x0b\x32).aalyria.spacetime.api.nbi.v1alpha.EntityR\x08\x65ntities\"\xdb\x02\n\x1bListEntitiesOverTimeRequest\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.aalyria.spacetime.api.nbi.v1alpha.EntityTypeR\x04type\x12\x46\n\x08interval\x18\x02 \x01(\x0b\x32*.aalyria.spacetime.api.common.TimeIntervalR\x08interval\x12\x42\n\x1d\x63ompute_cartesian_coordinates\x18\x03 \x01(\x08R\x1b\x63omputeCartesianCoordinates\x12G\n\x06\x66ilter\x18\x04 \x01(\x0b\x32/.aalyria.spacetime.api.nbi.v1alpha.EntityFilterR\x06\x66ilter\x12\x10\n\x03ids\x18\x05 \x03(\tR\x03ids\x12\x12\n\x04\x64iff\x18\x06 \x01(\x08R\x04\x64iff\"e\n\x1cListEntitiesOverTimeResponse\x12\x45\n\x08\x65ntities\x18\x01 \x03(\x0b\x32).aalyria.spacetime.api.nbi.v1alpha.EntityR\x08\x65ntities\"\xe3\x01\n\x0c\x45ntityFilter\x12\'\n\x0freferences_node\x18\x01 \x03(\tR\x0ereferencesNode\x12<\n\x1areferences_service_request\x18\x02 \x03(\tR\x18referencesServiceRequest\x12l\n\x15include_intent_states\x18\x03 \x03(\x0e\x32\x38.aalyria.spacetime.api.nbi.v1alpha.resources.IntentStateR\x13includeIntentStates\"\xd6\x01\n\x13\x44\x65leteEntityRequest\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32-.aalyria.spacetime.api.nbi.v1alpha.EntityTypeR\x04type\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x32\n\x15last_commit_timestamp\x18\x03 \x01(\x03R\x13lastCommitTimestamp\x12\x38\n\x18ignore_consistency_check\x18\x04 \x01(\x08R\x16ignoreConsistencyCheck\"\x16\n\x14\x44\x65leteEntityResponse\"\x81\x01\n\x13LoadScenarioRequest\x12j\n\x11scenario_settings\x18\x01 \x01(\x0b\x32=.aalyria.spacetime.api.nbi.v1alpha.resources.ScenarioSettingsR\x10scenarioSettings\"\x16\n\x14LoadScenarioResponse*\xc7\x03\n\nEntityType\x12\x1b\n\x17\x45NTITY_TYPE_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x41NTENNA_PATTERN\x10\x0c\x12\x10\n\x0c\x42\x41ND_PROFILE\x10\x10\x12\x14\n\x10\x43\x44PI_STREAM_INFO\x10\x11\x12\x15\n\x11\x44\x45VICES_IN_REGION\x10\x18\x12\x0f\n\x0bSTATION_SET\x10\x15\x12\x12\n\x0eSURFACE_REGION\x10\x16\x12\x13\n\x0f\x44RAIN_PROVISION\x10\x14\x12\n\n\x06INTENT\x10\x06\x12\x19\n\x15INTERFACE_LINK_REPORT\x10\x05\x12\x1b\n\x17INTERFERENCE_CONSTRAINT\x10\x17\x12\x15\n\x11MOTION_DEFINITION\x10\x04\x12\x10\n\x0cNETWORK_NODE\x10\x03\x12\x18\n\x14NETWORK_STATS_REPORT\x10\x08\x12\x17\n\x13PLATFORM_DEFINITION\x10\x01\x12\x17\n\x13PROPAGATION_WEATHER\x10\x0f\x12\x13\n\x0fSERVICE_REQUEST\x10\x02\x12\x1b\n\x17TRANSCEIVER_LINK_REPORT\x10\x13\x12\x13\n\x0f\x43OMPUTED_MOTION\x10\x07\"\x04\x08\x0e\x10\x0e\"\x08\x08\x19\x10\xff\xff\xff\xff\x07\x32\x8c\x07\n\x06NetOps\x12m\n\tGetEntity\x12\x33.aalyria.spacetime.api.nbi.v1alpha.GetEntityRequest\x1a).aalyria.spacetime.api.nbi.v1alpha.Entity\"\x00\x12s\n\x0c\x43reateEntity\x12\x36.aalyria.spacetime.api.nbi.v1alpha.CreateEntityRequest\x1a).aalyria.spacetime.api.nbi.v1alpha.Entity\"\x00\x12s\n\x0cUpdateEntity\x12\x36.aalyria.spacetime.api.nbi.v1alpha.UpdateEntityRequest\x1a).aalyria.spacetime.api.nbi.v1alpha.Entity\"\x00\x12\x81\x01\n\x0cListEntities\x12\x36.aalyria.spacetime.api.nbi.v1alpha.ListEntitiesRequest\x1a\x37.aalyria.spacetime.api.nbi.v1alpha.ListEntitiesResponse\"\x00\x12\x99\x01\n\x14ListEntitiesOverTime\x12>.aalyria.spacetime.api.nbi.v1alpha.ListEntitiesOverTimeRequest\x1a?.aalyria.spacetime.api.nbi.v1alpha.ListEntitiesOverTimeResponse\"\x00\x12\x81\x01\n\x0c\x44\x65leteEntity\x12\x36.aalyria.spacetime.api.nbi.v1alpha.DeleteEntityRequest\x1a\x37.aalyria.spacetime.api.nbi.v1alpha.DeleteEntityResponse\"\x00\x12\x84\x01\n\x0cLoadScenario\x12\x36.aalyria.spacetime.api.nbi.v1alpha.LoadScenarioRequest\x1a\x37.aalyria.spacetime.api.nbi.v1alpha.LoadScenarioResponse\"\x03\x88\x02\x01\x42N\n%com.aalyria.spacetime.api.nbi.v1alphaZ%aalyria.com/spacetime/api/nbi/v1alpha')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'api.nbi.v1alpha.nbi_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.aalyria.spacetime.api.nbi.v1alphaZ%aalyria.com/spacetime/api/nbi/v1alpha'
  _NETOPS.methods_by_name['LoadScenario']._options = None
  _NETOPS.methods_by_name['LoadScenario']._serialized_options = b'\210\002\001'
  _globals['_ENTITYTYPE']._serialized_start=4783
  _globals['_ENTITYTYPE']._serialized_end=5238
  _globals['_ENTITYGROUP']._serialized_start=735
  _globals['_ENTITYGROUP']._serialized_end=838
  _globals['_RESOURCEORIGIN']._serialized_start=840
  _globals['_RESOURCEORIGIN']._serialized_end=901
  _globals['_ENTITY']._serialized_start=904
  _globals['_ENTITY']._serialized_end=2964
  _globals['_GETENTITYREQUEST']._serialized_start=2966
  _globals['_GETENTITYREQUEST']._serialized_end=3067
  _globals['_CREATEENTITYREQUEST']._serialized_start=3069
  _globals['_CREATEENTITYREQUEST']._serialized_end=3157
  _globals['_UPDATEENTITYREQUEST']._serialized_start=3160
  _globals['_UPDATEENTITYREQUEST']._serialized_end=3306
  _globals['_LISTENTITIESREQUEST']._serialized_start=3309
  _globals['_LISTENTITIESREQUEST']._serialized_end=3605
  _globals['_LISTENTITIESRESPONSE']._serialized_start=3607
  _globals['_LISTENTITIESRESPONSE']._serialized_end=3700
  _globals['_LISTENTITIESOVERTIMEREQUEST']._serialized_start=3703
  _globals['_LISTENTITIESOVERTIMEREQUEST']._serialized_end=4050
  _globals['_LISTENTITIESOVERTIMERESPONSE']._serialized_start=4052
  _globals['_LISTENTITIESOVERTIMERESPONSE']._serialized_end=4153
  _globals['_ENTITYFILTER']._serialized_start=4156
  _globals['_ENTITYFILTER']._serialized_end=4383
  _globals['_DELETEENTITYREQUEST']._serialized_start=4386
  _globals['_DELETEENTITYREQUEST']._serialized_end=4600
  _globals['_DELETEENTITYRESPONSE']._serialized_start=4602
  _globals['_DELETEENTITYRESPONSE']._serialized_end=4624
  _globals['_LOADSCENARIOREQUEST']._serialized_start=4627
  _globals['_LOADSCENARIOREQUEST']._serialized_end=4756
  _globals['_LOADSCENARIORESPONSE']._serialized_start=4758
  _globals['_LOADSCENARIORESPONSE']._serialized_end=4780
  _globals['_NETOPS']._serialized_start=5241
  _globals['_NETOPS']._serialized_end=6149
# @@protoc_insertion_point(module_scope)
