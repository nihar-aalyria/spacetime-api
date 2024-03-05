// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/nbi/v1alpha/resources/devices_in_region.proto

#include "api/nbi/v1alpha/resources/devices_in_region.pb.h"

#include <algorithm>
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/extension_set.h"
#include "google/protobuf/wire_format_lite.h"
#include "google/protobuf/descriptor.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/reflection_ops.h"
#include "google/protobuf/wire_format.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"
PROTOBUF_PRAGMA_INIT_SEG
namespace _pb = ::PROTOBUF_NAMESPACE_ID;
namespace _pbi = ::PROTOBUF_NAMESPACE_ID::internal;
namespace aalyria {
namespace spacetime {
namespace api {
namespace nbi {
namespace v1alpha {
namespace resources {
template <typename>
PROTOBUF_CONSTEXPR DevicesInRegion::DevicesInRegion(
    ::_pbi::ConstantInitialized): _impl_{
    /*decltype(_impl_._has_bits_)*/{}
  , /*decltype(_impl_._cached_size_)*/{}
  , /*decltype(_impl_.device_in_region_id_)*/ {
    &::_pbi::fixed_address_empty_string, ::_pbi::ConstantInitialized {}
  }

  , /*decltype(_impl_.reference_device_)*/nullptr
  , /*decltype(_impl_.region_on_earth_)*/nullptr
  , /*decltype(_impl_.devices_per_km2_)*/ 0
} {}
struct DevicesInRegionDefaultTypeInternal {
  PROTOBUF_CONSTEXPR DevicesInRegionDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~DevicesInRegionDefaultTypeInternal() {}
  union {
    DevicesInRegion _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 DevicesInRegionDefaultTypeInternal _DevicesInRegion_default_instance_;
}  // namespace resources
}  // namespace v1alpha
}  // namespace nbi
}  // namespace api
}  // namespace spacetime
}  // namespace aalyria
static ::_pb::Metadata file_level_metadata_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto[1];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto = nullptr;
const ::uint32_t TableStruct_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _impl_._has_bits_),
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _impl_.device_in_region_id_),
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _impl_.reference_device_),
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _impl_.region_on_earth_),
    PROTOBUF_FIELD_OFFSET(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion, _impl_.devices_per_km2_),
    0,
    1,
    2,
    3,
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        { 0, 12, -1, sizeof(::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::aalyria::spacetime::api::nbi::v1alpha::resources::_DevicesInRegion_default_instance_._instance,
};
const char descriptor_table_protodef_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n1api/nbi/v1alpha/resources/devices_in_r"
    "egion.proto\022+aalyria.spacetime.api.nbi.v"
    "1alpha.resources\032%api/common/wireless_tr"
    "ansceiver.proto\032(api/nbi/v1alpha/resourc"
    "es/coverage.proto\"\247\002\n\017DevicesInRegion\022-\n"
    "\023device_in_region_id\030\001 \001(\tR\020deviceInRegi"
    "onId\022Y\n\020reference_device\030\002 \001(\0132..aalyria"
    ".spacetime.api.common.TransceiverModelR\017"
    "referenceDevice\022b\n\017region_on_earth\030\003 \001(\013"
    "2:.aalyria.spacetime.api.nbi.v1alpha.res"
    "ources.GeoJsonRegionR\rregionOnEarth\022&\n\017d"
    "evices_per_km2\030\004 \001(\001R\rdevicesPerKm2Bb\n/c"
    "om.aalyria.spacetime.api.nbi.v1alpha.res"
    "ourcesZ/aalyria.com/spacetime/api/nbi/v1"
    "alpha/resources"
};
static const ::_pbi::DescriptorTable* const descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_deps[2] =
    {
        &::descriptor_table_api_2fcommon_2fwireless_5ftransceiver_2eproto,
        &::descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fcoverage_2eproto,
};
static ::absl::once_flag descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto = {
    false,
    false,
    575,
    descriptor_table_protodef_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto,
    "api/nbi/v1alpha/resources/devices_in_region.proto",
    &descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_once,
    descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_deps,
    2,
    1,
    schemas,
    file_default_instances,
    TableStruct_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto::offsets,
    file_level_metadata_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto,
    file_level_enum_descriptors_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto,
    file_level_service_descriptors_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto,
};

// This function exists to be marked as weak.
// It can significantly speed up compilation by breaking up LLVM's SCC
// in the .pb.cc translation units. Large translation units see a
// reduction of more than 35% of walltime for optimized builds. Without
// the weak attribute all the messages in the file, including all the
// vtables and everything they use become part of the same SCC through
// a cycle like:
// GetMetadata -> descriptor table -> default instances ->
//   vtables -> GetMetadata
// By adding a weak function here we break the connection from the
// individual vtables back into the descriptor table.
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_getter() {
  return &descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto(&descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto);
namespace aalyria {
namespace spacetime {
namespace api {
namespace nbi {
namespace v1alpha {
namespace resources {
// ===================================================================

class DevicesInRegion::_Internal {
 public:
  using HasBits = decltype(std::declval<DevicesInRegion>()._impl_._has_bits_);
  static constexpr ::int32_t kHasBitsOffset =
    8 * PROTOBUF_FIELD_OFFSET(DevicesInRegion, _impl_._has_bits_);
  static void set_has_device_in_region_id(HasBits* has_bits) {
    (*has_bits)[0] |= 1u;
  }
  static const ::aalyria::spacetime::api::common::TransceiverModel& reference_device(const DevicesInRegion* msg);
  static void set_has_reference_device(HasBits* has_bits) {
    (*has_bits)[0] |= 2u;
  }
  static const ::aalyria::spacetime::api::nbi::v1alpha::resources::GeoJsonRegion& region_on_earth(const DevicesInRegion* msg);
  static void set_has_region_on_earth(HasBits* has_bits) {
    (*has_bits)[0] |= 4u;
  }
  static void set_has_devices_per_km2(HasBits* has_bits) {
    (*has_bits)[0] |= 8u;
  }
};

const ::aalyria::spacetime::api::common::TransceiverModel&
DevicesInRegion::_Internal::reference_device(const DevicesInRegion* msg) {
  return *msg->_impl_.reference_device_;
}
const ::aalyria::spacetime::api::nbi::v1alpha::resources::GeoJsonRegion&
DevicesInRegion::_Internal::region_on_earth(const DevicesInRegion* msg) {
  return *msg->_impl_.region_on_earth_;
}
void DevicesInRegion::clear_reference_device() {
  if (_impl_.reference_device_ != nullptr) _impl_.reference_device_->Clear();
  _impl_._has_bits_[0] &= ~0x00000002u;
}
void DevicesInRegion::clear_region_on_earth() {
  if (_impl_.region_on_earth_ != nullptr) _impl_.region_on_earth_->Clear();
  _impl_._has_bits_[0] &= ~0x00000004u;
}
DevicesInRegion::DevicesInRegion(::PROTOBUF_NAMESPACE_ID::Arena* arena)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
}
DevicesInRegion::DevicesInRegion(const DevicesInRegion& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  DevicesInRegion* const _this = this; (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_._has_bits_){from._impl_._has_bits_}
    , /*decltype(_impl_._cached_size_)*/{}
    , decltype(_impl_.device_in_region_id_) {}

    , decltype(_impl_.reference_device_){nullptr}
    , decltype(_impl_.region_on_earth_){nullptr}
    , decltype(_impl_.devices_per_km2_) {}
  };

  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  _impl_.device_in_region_id_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.device_in_region_id_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if ((from._impl_._has_bits_[0] & 0x00000001u) != 0) {
    _this->_impl_.device_in_region_id_.Set(from._internal_device_in_region_id(), _this->GetArenaForAllocation());
  }
  if ((from._impl_._has_bits_[0] & 0x00000002u) != 0) {
    _this->_impl_.reference_device_ = new ::aalyria::spacetime::api::common::TransceiverModel(*from._impl_.reference_device_);
  }
  if ((from._impl_._has_bits_[0] & 0x00000004u) != 0) {
    _this->_impl_.region_on_earth_ = new ::aalyria::spacetime::api::nbi::v1alpha::resources::GeoJsonRegion(*from._impl_.region_on_earth_);
  }
  _this->_impl_.devices_per_km2_ = from._impl_.devices_per_km2_;
  // @@protoc_insertion_point(copy_constructor:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
}

inline void DevicesInRegion::SharedCtor(::_pb::Arena* arena) {
  (void)arena;
  new (&_impl_) Impl_{
      decltype(_impl_._has_bits_){}
    , /*decltype(_impl_._cached_size_)*/{}
    , decltype(_impl_.device_in_region_id_) {}

    , decltype(_impl_.reference_device_){nullptr}
    , decltype(_impl_.region_on_earth_){nullptr}
    , decltype(_impl_.devices_per_km2_) { 0 }

  };
  _impl_.device_in_region_id_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
        _impl_.device_in_region_id_.Set("", GetArenaForAllocation());
  #endif  // PROTOBUF_FORCE_COPY_DEFAULT_STRING
}

DevicesInRegion::~DevicesInRegion() {
  // @@protoc_insertion_point(destructor:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  if (auto *arena = _internal_metadata_.DeleteReturnArena<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>()) {
  (void)arena;
    return;
  }
  SharedDtor();
}

inline void DevicesInRegion::SharedDtor() {
  ABSL_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.device_in_region_id_.Destroy();
  if (this != internal_default_instance()) delete _impl_.reference_device_;
  if (this != internal_default_instance()) delete _impl_.region_on_earth_;
}

void DevicesInRegion::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

void DevicesInRegion::Clear() {
// @@protoc_insertion_point(message_clear_start:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x00000007u) {
    if (cached_has_bits & 0x00000001u) {
      _impl_.device_in_region_id_.ClearNonDefaultToEmpty();
    }
    if (cached_has_bits & 0x00000002u) {
      ABSL_DCHECK(_impl_.reference_device_ != nullptr);
      _impl_.reference_device_->Clear();
    }
    if (cached_has_bits & 0x00000004u) {
      ABSL_DCHECK(_impl_.region_on_earth_ != nullptr);
      _impl_.region_on_earth_->Clear();
    }
  }
  _impl_.devices_per_km2_ = 0;
  _impl_._has_bits_.Clear();
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* DevicesInRegion::_InternalParse(const char* ptr, ::_pbi::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  _Internal::HasBits has_bits{};
  while (!ctx->Done(&ptr)) {
    ::uint32_t tag;
    ptr = ::_pbi::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // optional string device_in_region_id = 1 [json_name = "deviceInRegionId"];
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::uint8_t>(tag) == 10)) {
          auto str = _internal_mutable_device_in_region_id();
          ptr = ::_pbi::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
          #ifndef NDEBUG
          ::_pbi::VerifyUTF8(str, "aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion.device_in_region_id");
          #endif  // !NDEBUG
        } else {
          goto handle_unusual;
        }
        continue;
      // optional .aalyria.spacetime.api.common.TransceiverModel reference_device = 2 [json_name = "referenceDevice"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::uint8_t>(tag) == 18)) {
          ptr = ctx->ParseMessage(_internal_mutable_reference_device(), ptr);
          CHK_(ptr);
        } else {
          goto handle_unusual;
        }
        continue;
      // optional .aalyria.spacetime.api.nbi.v1alpha.resources.GeoJsonRegion region_on_earth = 3 [json_name = "regionOnEarth"];
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::uint8_t>(tag) == 26)) {
          ptr = ctx->ParseMessage(_internal_mutable_region_on_earth(), ptr);
          CHK_(ptr);
        } else {
          goto handle_unusual;
        }
        continue;
      // optional double devices_per_km2 = 4 [json_name = "devicesPerKm2"];
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::uint8_t>(tag) == 33)) {
          _Internal::set_has_devices_per_km2(&has_bits);
          _impl_.devices_per_km2_ = ::PROTOBUF_NAMESPACE_ID::internal::UnalignedLoad<double>(ptr);
          ptr += sizeof(double);
        } else {
          goto handle_unusual;
        }
        continue;
      default:
        goto handle_unusual;
    }  // switch
  handle_unusual:
    if ((tag == 0) || ((tag & 7) == 4)) {
      CHK_(ptr);
      ctx->SetLastTag(tag);
      goto message_done;
    }
    ptr = UnknownFieldParse(
        tag,
        _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
        ptr, ctx);
    CHK_(ptr != nullptr);
  }  // while
message_done:
  _impl_._has_bits_.Or(has_bits);
  return ptr;
failure:
  ptr = nullptr;
  goto message_done;
#undef CHK_
}

::uint8_t* DevicesInRegion::_InternalSerialize(
    ::uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  // optional string device_in_region_id = 1 [json_name = "deviceInRegionId"];
  if (cached_has_bits & 0x00000001u) {
    const std::string& _s = this->_internal_device_in_region_id();
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::VerifyUTF8StringNamedField(_s.data(), static_cast<int>(_s.length()), ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::SERIALIZE,
                                "aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion.device_in_region_id");
    target = stream->WriteStringMaybeAliased(1, _s, target);
  }

  // optional .aalyria.spacetime.api.common.TransceiverModel reference_device = 2 [json_name = "referenceDevice"];
  if (cached_has_bits & 0x00000002u) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(2, _Internal::reference_device(this),
        _Internal::reference_device(this).GetCachedSize(), target, stream);
  }

  // optional .aalyria.spacetime.api.nbi.v1alpha.resources.GeoJsonRegion region_on_earth = 3 [json_name = "regionOnEarth"];
  if (cached_has_bits & 0x00000004u) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(3, _Internal::region_on_earth(this),
        _Internal::region_on_earth(this).GetCachedSize(), target, stream);
  }

  // optional double devices_per_km2 = 4 [json_name = "devicesPerKm2"];
  if (cached_has_bits & 0x00000008u) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteDoubleToArray(
        4, this->_internal_devices_per_km2(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  return target;
}

::size_t DevicesInRegion::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  cached_has_bits = _impl_._has_bits_[0];
  if (cached_has_bits & 0x0000000fu) {
    // optional string device_in_region_id = 1 [json_name = "deviceInRegionId"];
    if (cached_has_bits & 0x00000001u) {
      total_size += 1 + ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
                                      this->_internal_device_in_region_id());
    }

    // optional .aalyria.spacetime.api.common.TransceiverModel reference_device = 2 [json_name = "referenceDevice"];
    if (cached_has_bits & 0x00000002u) {
      total_size += 1 +
        ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
          *_impl_.reference_device_);
    }

    // optional .aalyria.spacetime.api.nbi.v1alpha.resources.GeoJsonRegion region_on_earth = 3 [json_name = "regionOnEarth"];
    if (cached_has_bits & 0x00000004u) {
      total_size += 1 +
        ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
          *_impl_.region_on_earth_);
    }

    // optional double devices_per_km2 = 4 [json_name = "devicesPerKm2"];
    if (cached_has_bits & 0x00000008u) {
      total_size += 9;
    }

  }
  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData DevicesInRegion::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSourceCheck,
    DevicesInRegion::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*DevicesInRegion::GetClassData() const { return &_class_data_; }


void DevicesInRegion::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg) {
  auto* const _this = static_cast<DevicesInRegion*>(&to_msg);
  auto& from = static_cast<const DevicesInRegion&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  cached_has_bits = from._impl_._has_bits_[0];
  if (cached_has_bits & 0x0000000fu) {
    if (cached_has_bits & 0x00000001u) {
      _this->_internal_set_device_in_region_id(from._internal_device_in_region_id());
    }
    if (cached_has_bits & 0x00000002u) {
      _this->_internal_mutable_reference_device()->::aalyria::spacetime::api::common::TransceiverModel::MergeFrom(
          from._internal_reference_device());
    }
    if (cached_has_bits & 0x00000004u) {
      _this->_internal_mutable_region_on_earth()->::aalyria::spacetime::api::nbi::v1alpha::resources::GeoJsonRegion::MergeFrom(
          from._internal_region_on_earth());
    }
    if (cached_has_bits & 0x00000008u) {
      _this->_impl_.devices_per_km2_ = from._impl_.devices_per_km2_;
    }
    _this->_impl_._has_bits_[0] |= cached_has_bits;
  }
  _this->_internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void DevicesInRegion::CopyFrom(const DevicesInRegion& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:aalyria.spacetime.api.nbi.v1alpha.resources.DevicesInRegion)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool DevicesInRegion::IsInitialized() const {
  if ((_impl_._has_bits_[0] & 0x00000002u) != 0) {
    if (!_impl_.reference_device_->IsInitialized()) return false;
  }
  return true;
}

void DevicesInRegion::InternalSwap(DevicesInRegion* other) {
  using std::swap;
  auto* lhs_arena = GetArenaForAllocation();
  auto* rhs_arena = other->GetArenaForAllocation();
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  swap(_impl_._has_bits_[0], other->_impl_._has_bits_[0]);
  ::_pbi::ArenaStringPtr::InternalSwap(&_impl_.device_in_region_id_, lhs_arena,
                                       &other->_impl_.device_in_region_id_, rhs_arena);
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(DevicesInRegion, _impl_.devices_per_km2_)
      + sizeof(DevicesInRegion::_impl_.devices_per_km2_)
      - PROTOBUF_FIELD_OFFSET(DevicesInRegion, _impl_.reference_device_)>(
          reinterpret_cast<char*>(&_impl_.reference_device_),
          reinterpret_cast<char*>(&other->_impl_.reference_device_));
}

::PROTOBUF_NAMESPACE_ID::Metadata DevicesInRegion::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_getter, &descriptor_table_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto_once,
      file_level_metadata_api_2fnbi_2fv1alpha_2fresources_2fdevices_5fin_5fregion_2eproto[0]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace resources
}  // namespace v1alpha
}  // namespace nbi
}  // namespace api
}  // namespace spacetime
}  // namespace aalyria
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion*
Arena::CreateMaybeMessage< ::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion >(Arena* arena) {
  return Arena::CreateMessageInternal< ::aalyria::spacetime::api::nbi::v1alpha::resources::DevicesInRegion >(arena);
}
PROTOBUF_NAMESPACE_CLOSE
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"