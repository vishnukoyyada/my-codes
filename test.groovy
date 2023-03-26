pipelineJob('job-dsl-plugin') {
  definition {
    cpsScm{
      scm {
        git {
          remote {
            url('https://github.com/vishnukoyyada/my-codes')
          }
          branch('main')
        }
      }
      lightweight()
    }
  }
}