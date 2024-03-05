// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: api/nbi/v1alpha/signal_propagation.proto

#include "api/nbi/v1alpha/signal_propagation.pb.h"
#include "api/nbi/v1alpha/signal_propagation.grpc.pb.h"

#include <functional>
#include <grpcpp/support/async_stream.h>
#include <grpcpp/support/async_unary_call.h>
#include <grpcpp/impl/channel_interface.h>
#include <grpcpp/impl/client_unary_call.h>
#include <grpcpp/support/client_callback.h>
#include <grpcpp/support/message_allocator.h>
#include <grpcpp/support/method_handler.h>
#include <grpcpp/impl/rpc_service_method.h>
#include <grpcpp/support/server_callback.h>
#include <grpcpp/impl/server_callback_handlers.h>
#include <grpcpp/server_context.h>
#include <grpcpp/impl/service_type.h>
#include <grpcpp/support/sync_stream.h>
namespace aalyria {
namespace spacetime {
namespace api {
namespace nbi {
namespace v1alpha {

static const char* SignalPropagation_method_names[] = {
  "/aalyria.spacetime.api.nbi.v1alpha.SignalPropagation/Evaluate",
};

std::unique_ptr< SignalPropagation::Stub> SignalPropagation::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< SignalPropagation::Stub> stub(new SignalPropagation::Stub(channel, options));
  return stub;
}

SignalPropagation::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_Evaluate_(SignalPropagation_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status SignalPropagation::Stub::Evaluate(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest& request, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Evaluate_, context, request, response);
}

void SignalPropagation::Stub::async::Evaluate(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest* request, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Evaluate_, context, request, response, std::move(f));
}

void SignalPropagation::Stub::async::Evaluate(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest* request, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Evaluate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse>* SignalPropagation::Stub::PrepareAsyncEvaluateRaw(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Evaluate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse>* SignalPropagation::Stub::AsyncEvaluateRaw(::grpc::ClientContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncEvaluateRaw(context, request, cq);
  result->StartCall();
  return result;
}

SignalPropagation::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      SignalPropagation_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< SignalPropagation::Service, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](SignalPropagation::Service* service,
             ::grpc::ServerContext* ctx,
             const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest* req,
             ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse* resp) {
               return service->Evaluate(ctx, req, resp);
             }, this)));
}

SignalPropagation::Service::~Service() {
}

::grpc::Status SignalPropagation::Service::Evaluate(::grpc::ServerContext* context, const ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationRequest* request, ::aalyria::spacetime::api::nbi::v1alpha::SignalPropagationResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace aalyria
}  // namespace spacetime
}  // namespace api
}  // namespace nbi
}  // namespace v1alpha

