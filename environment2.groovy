def setEnvironmentVariables() {
    return [
        ACR_NAME: "myegistry",
        DOCKER_IMAGE_NAME: "my-web-app",
        DOCKER_IMAGE_TAG: env.BUILD_NUMBER,
        GITHUB_REPO: "https://github.com/yeddulaswetha/AKS.git",
        AKS_CLUSTER_NAME: "aksdeployment",
        KUBECONFIG_PATH: "/var/lib/jenkins/workspace/kube-config"
    ]
}
