// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/SCM_Admin_protocol.proto

package org.apache.hadoop.yarn.proto;

public final class SCMAdminProtocol {
  private SCMAdminProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf service {@code hadoop.yarn.SCMAdminProtocolService}
   */
  public static abstract class SCMAdminProtocolService
      implements com.google.protobuf.Service {
    protected SCMAdminProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc runCleanerTask(.hadoop.yarn.RunSharedCacheCleanerTaskRequestProto) returns (.hadoop.yarn.RunSharedCacheCleanerTaskResponseProto);</code>
       */
      public abstract void runCleanerTask(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new SCMAdminProtocolService() {
        @java.lang.Override
        public  void runCleanerTask(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto> done) {
          impl.runCleanerTask(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.runCleanerTask(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc runCleanerTask(.hadoop.yarn.RunSharedCacheCleanerTaskRequestProto) returns (.hadoop.yarn.RunSharedCacheCleanerTaskResponseProto);</code>
     */
    public abstract void runCleanerTask(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.yarn.proto.SCMAdminProtocol.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.runCleanerTask(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.yarn.proto.SCMAdminProtocol.SCMAdminProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void runCleanerTask(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.class,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto runCleanerTask(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto runCleanerTask(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RunSharedCacheCleanerTaskResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.yarn.SCMAdminProtocolService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037server/SCM_Admin_protocol.proto\022\013hadoo" +
      "p.yarn\032\031yarn_service_protos.proto2\224\001\n\027SC" +
      "MAdminProtocolService\022y\n\016runCleanerTask\022" +
      "2.hadoop.yarn.RunSharedCacheCleanerTaskR" +
      "equestProto\0323.hadoop.yarn.RunSharedCache" +
      "CleanerTaskResponseProtoB6\n\034org.apache.h" +
      "adoop.yarn.protoB\020SCMAdminProtocol\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.yarn.proto.YarnServiceProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}