// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: api/nbi/v1alpha/nbi.proto

#ifndef GRPC_MOCK_api_2fnbi_2fv1alpha_2fnbi_2eproto__INCLUDED
#define GRPC_MOCK_api_2fnbi_2fv1alpha_2fnbi_2eproto__INCLUDED

#include "api/nbi/v1alpha/nbi.pb.h"
#include "api/nbi/v1alpha/nbi.grpc.pb.h"

#include <grpcpp/support/async_stream.h>
#include <grpcpp/support/sync_stream.h>
#include <gmock/gmock.h>
namespace aalyria {
namespace spacetime {
namespace api {
namespace nbi {
namespace v1alpha {

class MockNetOpsStub : public NetOps::StubInterface {
 public:
  MOCK_METHOD3(GetEntity, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::GetEntityRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::Entity* response));
  MOCK_METHOD3(AsyncGetEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::GetEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncGetEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::GetEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(CreateEntity, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::CreateEntityRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::Entity* response));
  MOCK_METHOD3(AsyncCreateEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::CreateEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncCreateEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::CreateEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(UpdateEntity, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::UpdateEntityRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::Entity* response));
  MOCK_METHOD3(AsyncUpdateEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::UpdateEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncUpdateEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::Entity>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::UpdateEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(ListEntities, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesResponse* response));
  MOCK_METHOD3(AsyncListEntitiesRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncListEntitiesRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(ListEntitiesOverTime, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeResponse* response));
  MOCK_METHOD3(AsyncListEntitiesOverTimeRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncListEntitiesOverTimeRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::ListEntitiesOverTimeRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(DeleteEntity, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityResponse* response));
  MOCK_METHOD3(AsyncDeleteEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncDeleteEntityRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::DeleteEntityRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(LoadScenario, ::grpc::Status(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioResponse* response));
  MOCK_METHOD3(AsyncLoadScenarioRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioRequest& request, ::grpc::CompletionQueue* cq));
  MOCK_METHOD3(PrepareAsyncLoadScenarioRaw, ::grpc::ClientAsyncResponseReaderInterface< ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioResponse>*(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::LoadScenarioRequest& request, ::grpc::CompletionQueue* cq));
};

}  // namespace v1alpha
}  // namespace nbi
}  // namespace api
}  // namespace spacetime
}  // namespace aalyria


#endif  // GRPC_MOCK_api_2fnbi_2fv1alpha_2fnbi_2eproto__INCLUDED
