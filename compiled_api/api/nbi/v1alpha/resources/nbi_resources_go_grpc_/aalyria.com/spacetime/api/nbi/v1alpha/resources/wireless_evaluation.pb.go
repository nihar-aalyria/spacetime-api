// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v4.23.1
// source: api/nbi/v1alpha/resources/wireless_evaluation.proto

package resources

import (
	common "aalyria.com/spacetime/api/common"
	interval "google.golang.org/genproto/googleapis/type/interval"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	durationpb "google.golang.org/protobuf/types/known/durationpb"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type NoAccessReason_Constraint int32

const (
	NoAccessReason_UNKNOWN_CONSTRAINT         NoAccessReason_Constraint = 1
	NoAccessReason_SEPARATION_FROM_AZ_EL_MASK NoAccessReason_Constraint = 2
	NoAccessReason_LINK_RANGE                 NoAccessReason_Constraint = 3
	NoAccessReason_FIELD_OF_VIEW_OR_REGARD    NoAccessReason_Constraint = 4
	NoAccessReason_SUN_EXCLUSION              NoAccessReason_Constraint = 5
	NoAccessReason_PLATFORM_OBSTRUCTION       NoAccessReason_Constraint = 6
	NoAccessReason_TERRAIN_OBSTRUCTION        NoAccessReason_Constraint = 7
	NoAccessReason_RECEIVER_CNR_TOO_LOW       NoAccessReason_Constraint = 8
	NoAccessReason_NO_LINE_OF_SIGHT           NoAccessReason_Constraint = 9
)

// Enum value maps for NoAccessReason_Constraint.
var (
	NoAccessReason_Constraint_name = map[int32]string{
		1: "UNKNOWN_CONSTRAINT",
		2: "SEPARATION_FROM_AZ_EL_MASK",
		3: "LINK_RANGE",
		4: "FIELD_OF_VIEW_OR_REGARD",
		5: "SUN_EXCLUSION",
		6: "PLATFORM_OBSTRUCTION",
		7: "TERRAIN_OBSTRUCTION",
		8: "RECEIVER_CNR_TOO_LOW",
		9: "NO_LINE_OF_SIGHT",
	}
	NoAccessReason_Constraint_value = map[string]int32{
		"UNKNOWN_CONSTRAINT":         1,
		"SEPARATION_FROM_AZ_EL_MASK": 2,
		"LINK_RANGE":                 3,
		"FIELD_OF_VIEW_OR_REGARD":    4,
		"SUN_EXCLUSION":              5,
		"PLATFORM_OBSTRUCTION":       6,
		"TERRAIN_OBSTRUCTION":        7,
		"RECEIVER_CNR_TOO_LOW":       8,
		"NO_LINE_OF_SIGHT":           9,
	}
)

func (x NoAccessReason_Constraint) Enum() *NoAccessReason_Constraint {
	p := new(NoAccessReason_Constraint)
	*p = x
	return p
}

func (x NoAccessReason_Constraint) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (NoAccessReason_Constraint) Descriptor() protoreflect.EnumDescriptor {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_enumTypes[0].Descriptor()
}

func (NoAccessReason_Constraint) Type() protoreflect.EnumType {
	return &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_enumTypes[0]
}

func (x NoAccessReason_Constraint) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Do not use.
func (x *NoAccessReason_Constraint) UnmarshalJSON(b []byte) error {
	num, err := protoimpl.X.UnmarshalJSONEnum(x.Descriptor(), b)
	if err != nil {
		return err
	}
	*x = NoAccessReason_Constraint(num)
	return nil
}

// Deprecated: Use NoAccessReason_Constraint.Descriptor instead.
func (NoAccessReason_Constraint) EnumDescriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{2, 0}
}

type TransceiverWithMotion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Model  *common.TransceiverModel `protobuf:"bytes,1,opt,name=model" json:"model,omitempty"`
	Motion *common.Motion           `protobuf:"bytes,2,opt,name=motion" json:"motion,omitempty"`
}

func (x *TransceiverWithMotion) Reset() {
	*x = TransceiverWithMotion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransceiverWithMotion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransceiverWithMotion) ProtoMessage() {}

func (x *TransceiverWithMotion) ProtoReflect() protoreflect.Message {
	mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransceiverWithMotion.ProtoReflect.Descriptor instead.
func (*TransceiverWithMotion) Descriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{0}
}

func (x *TransceiverWithMotion) GetModel() *common.TransceiverModel {
	if x != nil {
		return x.Model
	}
	return nil
}

func (x *TransceiverWithMotion) GetMotion() *common.Motion {
	if x != nil {
		return x.Motion
	}
	return nil
}

type TransceiverProvider struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Source:
	//
	//	*TransceiverProvider_IdInStore
	//	*TransceiverProvider_Definition
	Source isTransceiverProvider_Source `protobuf_oneof:"source"`
}

func (x *TransceiverProvider) Reset() {
	*x = TransceiverProvider{}
	if protoimpl.UnsafeEnabled {
		mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransceiverProvider) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransceiverProvider) ProtoMessage() {}

func (x *TransceiverProvider) ProtoReflect() protoreflect.Message {
	mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransceiverProvider.ProtoReflect.Descriptor instead.
func (*TransceiverProvider) Descriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{1}
}

func (m *TransceiverProvider) GetSource() isTransceiverProvider_Source {
	if m != nil {
		return m.Source
	}
	return nil
}

func (x *TransceiverProvider) GetIdInStore() *common.TransceiverModelId {
	if x, ok := x.GetSource().(*TransceiverProvider_IdInStore); ok {
		return x.IdInStore
	}
	return nil
}

func (x *TransceiverProvider) GetDefinition() *TransceiverWithMotion {
	if x, ok := x.GetSource().(*TransceiverProvider_Definition); ok {
		return x.Definition
	}
	return nil
}

type isTransceiverProvider_Source interface {
	isTransceiverProvider_Source()
}

type TransceiverProvider_IdInStore struct {
	IdInStore *common.TransceiverModelId `protobuf:"bytes,1,opt,name=id_in_store,json=idInStore,oneof"`
}

type TransceiverProvider_Definition struct {
	Definition *TransceiverWithMotion `protobuf:"bytes,2,opt,name=definition,oneof"`
}

func (*TransceiverProvider_IdInStore) isTransceiverProvider_Source() {}

func (*TransceiverProvider_Definition) isTransceiverProvider_Source() {}

type NoAccessReason struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Constraint         *NoAccessReason_Constraint `protobuf:"varint,1,opt,name=constraint,enum=aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason_Constraint" json:"constraint,omitempty"`
	TransceiverLinkEnd *common.TransceiverModelId `protobuf:"bytes,2,opt,name=transceiver_link_end,json=transceiverLinkEnd" json:"transceiver_link_end,omitempty"`
}

func (x *NoAccessReason) Reset() {
	*x = NoAccessReason{}
	if protoimpl.UnsafeEnabled {
		mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NoAccessReason) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NoAccessReason) ProtoMessage() {}

func (x *NoAccessReason) ProtoReflect() protoreflect.Message {
	mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NoAccessReason.ProtoReflect.Descriptor instead.
func (*NoAccessReason) Descriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{2}
}

func (x *NoAccessReason) GetConstraint() NoAccessReason_Constraint {
	if x != nil && x.Constraint != nil {
		return *x.Constraint
	}
	return NoAccessReason_UNKNOWN_CONSTRAINT
}

func (x *NoAccessReason) GetTransceiverLinkEnd() *common.TransceiverModelId {
	if x != nil {
		return x.TransceiverLinkEnd
	}
	return nil
}

type AccessInterval struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Interval            *interval.Interval    `protobuf:"bytes,1,opt,name=interval" json:"interval,omitempty"`
	Accessibility       *Accessibility        `protobuf:"varint,2,opt,name=accessibility,enum=aalyria.spacetime.api.nbi.v1alpha.resources.Accessibility" json:"accessibility,omitempty"`
	NoAccessReason      []*NoAccessReason     `protobuf:"bytes,3,rep,name=no_access_reason,json=noAccessReason" json:"no_access_reason,omitempty"`
	PropagationOverTime []*SpatialPropagation `protobuf:"bytes,4,rep,name=propagation_over_time,json=propagationOverTime" json:"propagation_over_time,omitempty"`
}

func (x *AccessInterval) Reset() {
	*x = AccessInterval{}
	if protoimpl.UnsafeEnabled {
		mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AccessInterval) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AccessInterval) ProtoMessage() {}

func (x *AccessInterval) ProtoReflect() protoreflect.Message {
	mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AccessInterval.ProtoReflect.Descriptor instead.
func (*AccessInterval) Descriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{3}
}

func (x *AccessInterval) GetInterval() *interval.Interval {
	if x != nil {
		return x.Interval
	}
	return nil
}

func (x *AccessInterval) GetAccessibility() Accessibility {
	if x != nil && x.Accessibility != nil {
		return *x.Accessibility
	}
	return Accessibility_ACCESS_UNKNOWN
}

func (x *AccessInterval) GetNoAccessReason() []*NoAccessReason {
	if x != nil {
		return x.NoAccessReason
	}
	return nil
}

func (x *AccessInterval) GetPropagationOverTime() []*SpatialPropagation {
	if x != nil {
		return x.PropagationOverTime
	}
	return nil
}

type SpatialPropagation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Timestamp        *timestamppb.Timestamp `protobuf:"bytes,1,opt,name=timestamp" json:"timestamp,omitempty"`
	Reception        *WirelessLinkBudget    `protobuf:"bytes,2,opt,name=reception" json:"reception,omitempty"`
	PointingVector   *common.PointingVector `protobuf:"bytes,3,opt,name=pointing_vector,json=pointingVector" json:"pointing_vector,omitempty"`
	RangeM           *float64               `protobuf:"fixed64,4,opt,name=range_m,json=rangeM" json:"range_m,omitempty"`
	PropagationDelay *durationpb.Duration   `protobuf:"bytes,5,opt,name=propagation_delay,json=propagationDelay" json:"propagation_delay,omitempty"`
	Coverage         *SignalPowerCoverage   `protobuf:"bytes,6,opt,name=coverage" json:"coverage,omitempty"`
}

func (x *SpatialPropagation) Reset() {
	*x = SpatialPropagation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SpatialPropagation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SpatialPropagation) ProtoMessage() {}

func (x *SpatialPropagation) ProtoReflect() protoreflect.Message {
	mi := &file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SpatialPropagation.ProtoReflect.Descriptor instead.
func (*SpatialPropagation) Descriptor() ([]byte, []int) {
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP(), []int{4}
}

func (x *SpatialPropagation) GetTimestamp() *timestamppb.Timestamp {
	if x != nil {
		return x.Timestamp
	}
	return nil
}

func (x *SpatialPropagation) GetReception() *WirelessLinkBudget {
	if x != nil {
		return x.Reception
	}
	return nil
}

func (x *SpatialPropagation) GetPointingVector() *common.PointingVector {
	if x != nil {
		return x.PointingVector
	}
	return nil
}

func (x *SpatialPropagation) GetRangeM() float64 {
	if x != nil && x.RangeM != nil {
		return *x.RangeM
	}
	return 0
}

func (x *SpatialPropagation) GetPropagationDelay() *durationpb.Duration {
	if x != nil {
		return x.PropagationDelay
	}
	return nil
}

func (x *SpatialPropagation) GetCoverage() *SignalPowerCoverage {
	if x != nil {
		return x.Coverage
	}
	return nil
}

var File_api_nbi_v1alpha_resources_wireless_evaluation_proto protoreflect.FileDescriptor

var file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDesc = []byte{
	0x0a, 0x33, 0x61, 0x70, 0x69, 0x2f, 0x6e, 0x62, 0x69, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x77, 0x69, 0x72, 0x65,
	0x6c, 0x65, 0x73, 0x73, 0x5f, 0x65, 0x76, 0x61, 0x6c, 0x75, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x2b, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69,
	0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x73, 0x1a, 0x1c, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63,
	0x6f, 0x6f, 0x72, 0x64, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x25, 0x61, 0x70, 0x69, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x77, 0x69, 0x72,
	0x65, 0x6c, 0x65, 0x73, 0x73, 0x5f, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65,
	0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x61, 0x70, 0x69, 0x2f, 0x6e, 0x62, 0x69,
	0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x73, 0x2f, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x2c, 0x61, 0x70, 0x69, 0x2f, 0x6e, 0x62, 0x69, 0x2f, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2f, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x64, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x69, 0x6e,
	0x74, 0x65, 0x72, 0x76, 0x61, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9b, 0x01, 0x0a,
	0x15, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72, 0x57, 0x69, 0x74, 0x68,
	0x4d, 0x6f, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x44, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2e, 0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72,
	0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x12, 0x3c, 0x0a, 0x06,
	0x6d, 0x6f, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24, 0x2e, 0x61,
	0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65,
	0x2e, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x4d, 0x6f, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x06, 0x6d, 0x6f, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0xd9, 0x01, 0x0a, 0x13, 0x54,
	0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x76, 0x69, 0x64,
	0x65, 0x72, 0x12, 0x52, 0x0a, 0x0b, 0x69, 0x64, 0x5f, 0x69, 0x6e, 0x5f, 0x73, 0x74, 0x6f, 0x72,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69,
	0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e,
	0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76,
	0x65, 0x72, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x49, 0x64, 0x48, 0x00, 0x52, 0x09, 0x69, 0x64, 0x49,
	0x6e, 0x53, 0x74, 0x6f, 0x72, 0x65, 0x12, 0x64, 0x0a, 0x0a, 0x64, 0x65, 0x66, 0x69, 0x6e, 0x69,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x42, 0x2e, 0x61, 0x61, 0x6c,
	0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61,
	0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x72,
	0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65,
	0x69, 0x76, 0x65, 0x72, 0x57, 0x69, 0x74, 0x68, 0x4d, 0x6f, 0x74, 0x69, 0x6f, 0x6e, 0x48, 0x00,
	0x52, 0x0a, 0x64, 0x65, 0x66, 0x69, 0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x08, 0x0a, 0x06,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x22, 0xc6, 0x03, 0x0a, 0x0e, 0x4e, 0x6f, 0x41, 0x63, 0x63,
	0x65, 0x73, 0x73, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x66, 0x0a, 0x0a, 0x63, 0x6f, 0x6e,
	0x73, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x46, 0x2e,
	0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d,
	0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x4e, 0x6f, 0x41, 0x63,
	0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x2e, 0x43, 0x6f, 0x6e, 0x73, 0x74,
	0x72, 0x61, 0x69, 0x6e, 0x74, 0x52, 0x0a, 0x63, 0x6f, 0x6e, 0x73, 0x74, 0x72, 0x61, 0x69, 0x6e,
	0x74, 0x12, 0x62, 0x0a, 0x14, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72,
	0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x65, 0x6e, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x30, 0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74,
	0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x54,
	0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x49,
	0x64, 0x52, 0x12, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x63, 0x65, 0x69, 0x76, 0x65, 0x72, 0x4c, 0x69,
	0x6e, 0x6b, 0x45, 0x6e, 0x64, 0x22, 0xe7, 0x01, 0x0a, 0x0a, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x72,
	0x61, 0x69, 0x6e, 0x74, 0x12, 0x16, 0x0a, 0x12, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x5f,
	0x43, 0x4f, 0x4e, 0x53, 0x54, 0x52, 0x41, 0x49, 0x4e, 0x54, 0x10, 0x01, 0x12, 0x1e, 0x0a, 0x1a,
	0x53, 0x45, 0x50, 0x41, 0x52, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x46, 0x52, 0x4f, 0x4d, 0x5f,
	0x41, 0x5a, 0x5f, 0x45, 0x4c, 0x5f, 0x4d, 0x41, 0x53, 0x4b, 0x10, 0x02, 0x12, 0x0e, 0x0a, 0x0a,
	0x4c, 0x49, 0x4e, 0x4b, 0x5f, 0x52, 0x41, 0x4e, 0x47, 0x45, 0x10, 0x03, 0x12, 0x1b, 0x0a, 0x17,
	0x46, 0x49, 0x45, 0x4c, 0x44, 0x5f, 0x4f, 0x46, 0x5f, 0x56, 0x49, 0x45, 0x57, 0x5f, 0x4f, 0x52,
	0x5f, 0x52, 0x45, 0x47, 0x41, 0x52, 0x44, 0x10, 0x04, 0x12, 0x11, 0x0a, 0x0d, 0x53, 0x55, 0x4e,
	0x5f, 0x45, 0x58, 0x43, 0x4c, 0x55, 0x53, 0x49, 0x4f, 0x4e, 0x10, 0x05, 0x12, 0x18, 0x0a, 0x14,
	0x50, 0x4c, 0x41, 0x54, 0x46, 0x4f, 0x52, 0x4d, 0x5f, 0x4f, 0x42, 0x53, 0x54, 0x52, 0x55, 0x43,
	0x54, 0x49, 0x4f, 0x4e, 0x10, 0x06, 0x12, 0x17, 0x0a, 0x13, 0x54, 0x45, 0x52, 0x52, 0x41, 0x49,
	0x4e, 0x5f, 0x4f, 0x42, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x10, 0x07, 0x12,
	0x18, 0x0a, 0x14, 0x52, 0x45, 0x43, 0x45, 0x49, 0x56, 0x45, 0x52, 0x5f, 0x43, 0x4e, 0x52, 0x5f,
	0x54, 0x4f, 0x4f, 0x5f, 0x4c, 0x4f, 0x57, 0x10, 0x08, 0x12, 0x14, 0x0a, 0x10, 0x4e, 0x4f, 0x5f,
	0x4c, 0x49, 0x4e, 0x45, 0x5f, 0x4f, 0x46, 0x5f, 0x53, 0x49, 0x47, 0x48, 0x54, 0x10, 0x09, 0x22,
	0x81, 0x03, 0x0a, 0x0e, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76,
	0x61, 0x6c, 0x12, 0x31, 0x0a, 0x08, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x61, 0x6c, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x61, 0x6c, 0x52, 0x08, 0x69, 0x6e, 0x74,
	0x65, 0x72, 0x76, 0x61, 0x6c, 0x12, 0x60, 0x0a, 0x0d, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x69,
	0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x3a, 0x2e, 0x61,
	0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65,
	0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61,
	0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x41, 0x63, 0x63, 0x65, 0x73,
	0x73, 0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x52, 0x0d, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73,
	0x69, 0x62, 0x69, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x65, 0x0a, 0x10, 0x6e, 0x6f, 0x5f, 0x61, 0x63,
	0x63, 0x65, 0x73, 0x73, 0x5f, 0x72, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x3b, 0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31,
	0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e,
	0x4e, 0x6f, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x52, 0x0e,
	0x6e, 0x6f, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x52, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x73,
	0x0a, 0x15, 0x70, 0x72, 0x6f, 0x70, 0x61, 0x67, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6f, 0x76,
	0x65, 0x72, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x3f, 0x2e,
	0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d,
	0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x70, 0x61, 0x74,
	0x69, 0x61, 0x6c, 0x50, 0x72, 0x6f, 0x70, 0x61, 0x67, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x13,
	0x70, 0x72, 0x6f, 0x70, 0x61, 0x67, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4f, 0x76, 0x65, 0x72, 0x54,
	0x69, 0x6d, 0x65, 0x22, 0xc3, 0x03, 0x0a, 0x12, 0x53, 0x70, 0x61, 0x74, 0x69, 0x61, 0x6c, 0x50,
	0x72, 0x6f, 0x70, 0x61, 0x67, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x38, 0x0a, 0x09, 0x74, 0x69,
	0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e,
	0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73,
	0x74, 0x61, 0x6d, 0x70, 0x12, 0x5d, 0x0a, 0x09, 0x72, 0x65, 0x63, 0x65, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x3f, 0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69,
	0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e,
	0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x57, 0x69, 0x72, 0x65, 0x6c, 0x65, 0x73, 0x73, 0x4c, 0x69,
	0x6e, 0x6b, 0x42, 0x75, 0x64, 0x67, 0x65, 0x74, 0x52, 0x09, 0x72, 0x65, 0x63, 0x65, 0x70, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x55, 0x0a, 0x0f, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x69, 0x6e, 0x67, 0x5f,
	0x76, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2c, 0x2e, 0x61,
	0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d, 0x65,
	0x2e, 0x61, 0x70, 0x69, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x50, 0x6f, 0x69, 0x6e,
	0x74, 0x69, 0x6e, 0x67, 0x56, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x52, 0x0e, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x69, 0x6e, 0x67, 0x56, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x12, 0x17, 0x0a, 0x07, 0x72, 0x61,
	0x6e, 0x67, 0x65, 0x5f, 0x6d, 0x18, 0x04, 0x20, 0x01, 0x28, 0x01, 0x52, 0x06, 0x72, 0x61, 0x6e,
	0x67, 0x65, 0x4d, 0x12, 0x46, 0x0a, 0x11, 0x70, 0x72, 0x6f, 0x70, 0x61, 0x67, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x64, 0x65, 0x6c, 0x61, 0x79, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19,
	0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2e, 0x44, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x10, 0x70, 0x72, 0x6f, 0x70, 0x61,
	0x67, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x44, 0x65, 0x6c, 0x61, 0x79, 0x12, 0x5c, 0x0a, 0x08, 0x63,
	0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x40, 0x2e,
	0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69, 0x6d,
	0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70, 0x68,
	0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2e, 0x53, 0x69, 0x67, 0x6e,
	0x61, 0x6c, 0x50, 0x6f, 0x77, 0x65, 0x72, 0x43, 0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x52,
	0x08, 0x63, 0x6f, 0x76, 0x65, 0x72, 0x61, 0x67, 0x65, 0x42, 0x62, 0x0a, 0x2f, 0x63, 0x6f, 0x6d,
	0x2e, 0x61, 0x61, 0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74, 0x69,
	0x6d, 0x65, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x6e, 0x62, 0x69, 0x2e, 0x76, 0x31, 0x61, 0x6c, 0x70,
	0x68, 0x61, 0x2e, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x5a, 0x2f, 0x61, 0x61,
	0x6c, 0x79, 0x72, 0x69, 0x61, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x70, 0x61, 0x63, 0x65, 0x74,
	0x69, 0x6d, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x6e, 0x62, 0x69, 0x2f, 0x76, 0x31, 0x61, 0x6c,
	0x70, 0x68, 0x61, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73,
}

var (
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescOnce sync.Once
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescData = file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDesc
)

func file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescGZIP() []byte {
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescOnce.Do(func() {
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescData = protoimpl.X.CompressGZIP(file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescData)
	})
	return file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDescData
}

var file_api_nbi_v1alpha_resources_wireless_evaluation_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_api_nbi_v1alpha_resources_wireless_evaluation_proto_goTypes = []interface{}{
	(NoAccessReason_Constraint)(0),    // 0: aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason.Constraint
	(*TransceiverWithMotion)(nil),     // 1: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverWithMotion
	(*TransceiverProvider)(nil),       // 2: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverProvider
	(*NoAccessReason)(nil),            // 3: aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason
	(*AccessInterval)(nil),            // 4: aalyria.spacetime.api.nbi.v1alpha.resources.AccessInterval
	(*SpatialPropagation)(nil),        // 5: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation
	(*common.TransceiverModel)(nil),   // 6: aalyria.spacetime.api.common.TransceiverModel
	(*common.Motion)(nil),             // 7: aalyria.spacetime.api.common.Motion
	(*common.TransceiverModelId)(nil), // 8: aalyria.spacetime.api.common.TransceiverModelId
	(*interval.Interval)(nil),         // 9: google.type.Interval
	(Accessibility)(0),                // 10: aalyria.spacetime.api.nbi.v1alpha.resources.Accessibility
	(*timestamppb.Timestamp)(nil),     // 11: google.protobuf.Timestamp
	(*WirelessLinkBudget)(nil),        // 12: aalyria.spacetime.api.nbi.v1alpha.resources.WirelessLinkBudget
	(*common.PointingVector)(nil),     // 13: aalyria.spacetime.api.common.PointingVector
	(*durationpb.Duration)(nil),       // 14: google.protobuf.Duration
	(*SignalPowerCoverage)(nil),       // 15: aalyria.spacetime.api.nbi.v1alpha.resources.SignalPowerCoverage
}
var file_api_nbi_v1alpha_resources_wireless_evaluation_proto_depIdxs = []int32{
	6,  // 0: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverWithMotion.model:type_name -> aalyria.spacetime.api.common.TransceiverModel
	7,  // 1: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverWithMotion.motion:type_name -> aalyria.spacetime.api.common.Motion
	8,  // 2: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverProvider.id_in_store:type_name -> aalyria.spacetime.api.common.TransceiverModelId
	1,  // 3: aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverProvider.definition:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.TransceiverWithMotion
	0,  // 4: aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason.constraint:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason.Constraint
	8,  // 5: aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason.transceiver_link_end:type_name -> aalyria.spacetime.api.common.TransceiverModelId
	9,  // 6: aalyria.spacetime.api.nbi.v1alpha.resources.AccessInterval.interval:type_name -> google.type.Interval
	10, // 7: aalyria.spacetime.api.nbi.v1alpha.resources.AccessInterval.accessibility:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.Accessibility
	3,  // 8: aalyria.spacetime.api.nbi.v1alpha.resources.AccessInterval.no_access_reason:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.NoAccessReason
	5,  // 9: aalyria.spacetime.api.nbi.v1alpha.resources.AccessInterval.propagation_over_time:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation
	11, // 10: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation.timestamp:type_name -> google.protobuf.Timestamp
	12, // 11: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation.reception:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.WirelessLinkBudget
	13, // 12: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation.pointing_vector:type_name -> aalyria.spacetime.api.common.PointingVector
	14, // 13: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation.propagation_delay:type_name -> google.protobuf.Duration
	15, // 14: aalyria.spacetime.api.nbi.v1alpha.resources.SpatialPropagation.coverage:type_name -> aalyria.spacetime.api.nbi.v1alpha.resources.SignalPowerCoverage
	15, // [15:15] is the sub-list for method output_type
	15, // [15:15] is the sub-list for method input_type
	15, // [15:15] is the sub-list for extension type_name
	15, // [15:15] is the sub-list for extension extendee
	0,  // [0:15] is the sub-list for field type_name
}

func init() { file_api_nbi_v1alpha_resources_wireless_evaluation_proto_init() }
func file_api_nbi_v1alpha_resources_wireless_evaluation_proto_init() {
	if File_api_nbi_v1alpha_resources_wireless_evaluation_proto != nil {
		return
	}
	file_api_nbi_v1alpha_resources_coverage_proto_init()
	file_api_nbi_v1alpha_resources_network_link_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransceiverWithMotion); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransceiverProvider); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NoAccessReason); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AccessInterval); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SpatialPropagation); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*TransceiverProvider_IdInStore)(nil),
		(*TransceiverProvider_Definition)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_api_nbi_v1alpha_resources_wireless_evaluation_proto_goTypes,
		DependencyIndexes: file_api_nbi_v1alpha_resources_wireless_evaluation_proto_depIdxs,
		EnumInfos:         file_api_nbi_v1alpha_resources_wireless_evaluation_proto_enumTypes,
		MessageInfos:      file_api_nbi_v1alpha_resources_wireless_evaluation_proto_msgTypes,
	}.Build()
	File_api_nbi_v1alpha_resources_wireless_evaluation_proto = out.File
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_rawDesc = nil
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_goTypes = nil
	file_api_nbi_v1alpha_resources_wireless_evaluation_proto_depIdxs = nil
}
