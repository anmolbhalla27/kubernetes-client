
package io.fabric8.kubernetes.api.model.flowcontrol.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "group",
    "serviceAccount",
    "user"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class Subject implements Editable<SubjectBuilder>, KubernetesResource
{

    @JsonProperty("group")
    private GroupSubject group;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("serviceAccount")
    private ServiceAccountSubject serviceAccount;
    @JsonProperty("user")
    private UserSubject user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Subject() {
    }

    public Subject(GroupSubject group, String kind, ServiceAccountSubject serviceAccount, UserSubject user) {
        super();
        this.group = group;
        this.kind = kind;
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("group")
    public GroupSubject getGroup() {
        return group;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("group")
    public void setGroup(GroupSubject group) {
        this.group = group;
    }

    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * `kind` indicates which one of the other fields is non-empty. Required
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("serviceAccount")
    public ServiceAccountSubject getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("serviceAccount")
    public void setServiceAccount(ServiceAccountSubject serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("user")
    public UserSubject getUser() {
        return user;
    }

    /**
     * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
     */
    @JsonProperty("user")
    public void setUser(UserSubject user) {
        this.user = user;
    }

    @JsonIgnore
    public SubjectBuilder edit() {
        return new SubjectBuilder(this);
    }

    @JsonIgnore
    public SubjectBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
