(ns onyx-log-ui.state)

(def app-state
  (atom {:log-entries [{:fn :leave-cluster,
                        :args {:id #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"},
                        :peer-parent #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014",
                        :entry-parent 39,
                        :message-id 53,
                        :created-at 1456112511731}
                       {:fn :leave-cluster,
                        :args {:id #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                        :peer-parent #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                        :entry-parent 44,
                        :message-id 52,
                        :created-at 1456112511685}
                       {:fn :seal-output,
                        :args
                        {:job #uuid "9850cc48-455c-4713-9231-069eb3854d02",
                         :task #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"},
                        :message-id 51,
                        :created-at 1456112511656}
                       {:fn :exhaust-input,
                        :args
                        {:job #uuid "9850cc48-455c-4713-9231-069eb3854d02",
                         :task #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"},
                        :message-id 50,
                        :created-at 1456112511632}
                       {:fn :signal-ready,
                        :args {:id #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                        :message-id 49,
                        :created-at 1456112510789}
                       {:fn :signal-ready,
                        :args {:id #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"},
                        :message-id 48,
                        :created-at 1456112510788}
                       {:fn :signal-ready,
                        :args {:id #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                        :message-id 47,
                        :created-at 1456112510783}
                       {:fn :accept-join-cluster,
                        :args
                        {:observer #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                         :subject #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014",
                         :accepted-observer #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                         :accepted-joiner #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                        :peer-parent #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                        :entry-parent 45,
                        :message-id 46,
                        :created-at 1456112510731}
                       {:fn :notify-join-cluster,
                        :args {:observer #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                        :peer-parent #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                        :entry-parent 44,
                        :message-id 45,
                        :created-at 1456112510723}
                       {:fn :prepare-join-cluster,
                        :args
                        {:joiner #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                         :tags [],
                         :peer-site {:aeron/external-addr "localhost", :aeron/port 40199}},
                        :peer-parent #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                        :entry-parent 42,
                        :message-id 44,
                        :created-at 1456112510709}]

         :replica-states {46
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" 0},
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" 0},
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" 0}}},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             [#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]}},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :idle},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          48
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" 0},
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" 0},
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" 0}}},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             [#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]}},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :active,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :active,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :idle},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          50
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" 0},
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" 0},
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" 0}}},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            #{#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"}},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             [#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]}},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :active,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :active,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :active},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          44
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -22919},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -17533},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -5014}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids {},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations {},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared
                           {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          51
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids {},
                           :accepted {},
                           :jobs [],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations {},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :idle},
                           :completed-jobs
                           [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          47
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" 0},
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" 0},
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" 0}}},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             [#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]}},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :active,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :idle},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          45
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -22919},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -17533},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost", :aeron/port 40199, :aeron/acker-id -5014}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids {},
                           :accepted
                           {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations {},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          53
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids {},
                           :accepted {},
                           :jobs [],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs {},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations {},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle},
                           :completed-jobs
                           [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          52
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids {},
                           :accepted {},
                           :jobs [],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations {},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :idle,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :idle},
                           :completed-jobs
                           [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}},
                          49
                          {:exempt-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" [],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" []},
                           :peer-sites
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -22919,
                             :aeron/peer-task-id 7165},
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -17533,
                             :aeron/peer-task-id 31907},
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            {:aeron/external-addr "localhost",
                             :aeron/port 40199,
                             :aeron/acker-id -5014,
                             :aeron/peer-task-id -24888}},
                           :output-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :state-logs-marked #{},
                           :job-scheduler :onyx.job-scheduler/greedy,
                           :ackers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "9208746f-492f-46ca-844e-a4c46007b60a"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]},
                           :saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" Infinity,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" Infinity},
                           :task-percentages {},
                           :state-logs {},
                           :peers
                           [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"],
                           :acker-exclude-outputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :min-required-peers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" 1,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" 1,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}},
                           :task-slot-ids
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" 0},
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             {#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" 0},
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" 0}}},
                           :accepted {},
                           :jobs [#uuid "9850cc48-455c-4713-9231-069eb3854d02"],
                           :tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638"
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"]},
                           :task-metadata {},
                           :exhausted-inputs {},
                           :required-tags
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :pairs
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630",
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2",
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"},
                           :flux-policies
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" {},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" {}},
                           :messaging {:onyx.messaging/impl :aeron},
                           :allocations
                           {#uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f"
                             [#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014"],
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8"
                             [#uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630"],
                             #uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"
                             [#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2"]}},
                           :killed-jobs [],
                           :sealed-outputs {},
                           :prepared {},
                           :percentages {},
                           :input-tasks
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            [#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e"],
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            [#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366"]},
                           :peer-tags
                           {#uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" [],
                            #uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" [],
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" []},
                           :acker-percentage
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" 1,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" 1},
                           :peer-state
                           {#uuid "0c528f07-c2a6-4d44-96ee-85810c5e7014" :active,
                            #uuid "ae07949f-d89b-45c5-b2bf-cbf7e3aec630" :active,
                            #uuid "a202720c-6d56-424e-be3d-bd8642e05ce2" :active},
                           :completed-jobs [#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"],
                           :acker-exclude-inputs
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" false,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" false},
                           :task-schedulers
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a" :onyx.task-scheduler/balanced,
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02" :onyx.task-scheduler/balanced},
                           :task-saturation
                           {#uuid "db4932ed-6ccb-4129-8c60-ba6ce035d62a"
                            {#uuid "74dea3b2-17ed-4d25-8099-f06a9fc0765e" 1,
                             #uuid "13b22959-dc47-4bf4-845e-d99a13842638" Infinity,
                             #uuid "081d1bcb-a48b-43d4-95b5-ef174a715622" 1},
                            #uuid "9850cc48-455c-4713-9231-069eb3854d02"
                            {#uuid "f9cc647f-ceb8-47cd-9c4f-669a1fc1c366" 1,
                             #uuid "065801ca-bdb2-4103-83e4-b0cd2aad890f" Infinity,
                             #uuid "71ea9aa0-3a7b-4d99-8fac-981153356ca8" 1}}}}}))
