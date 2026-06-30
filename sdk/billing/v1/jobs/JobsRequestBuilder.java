package com.rixl.sdk.billing.v1.jobs;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.rixl.sdk.billing.v1.jobs.cleanupbandwidthsnapshots.CleanupBandwidthSnapshotsRequestBuilder;
import com.rixl.sdk.billing.v1.jobs.dailybandwidthcalculation.DailyBandwidthCalculationRequestBuilder;
import com.rixl.sdk.billing.v1.jobs.monthlybandwidthcalculation.MonthlyBandwidthCalculationRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /billing/v1/jobs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JobsRequestBuilder extends BaseRequestBuilder {
    /**
     * The cleanupBandwidthSnapshots property
     * @return a {@link CleanupBandwidthSnapshotsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CleanupBandwidthSnapshotsRequestBuilder cleanupBandwidthSnapshots() {
        return new CleanupBandwidthSnapshotsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dailyBandwidthCalculation property
     * @return a {@link DailyBandwidthCalculationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DailyBandwidthCalculationRequestBuilder dailyBandwidthCalculation() {
        return new DailyBandwidthCalculationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The monthlyBandwidthCalculation property
     * @return a {@link MonthlyBandwidthCalculationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonthlyBandwidthCalculationRequestBuilder monthlyBandwidthCalculation() {
        return new MonthlyBandwidthCalculationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link JobsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/jobs", pathParameters);
    }
    /**
     * Instantiates a new {@link JobsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/billing/v1/jobs", rawUrl);
    }
}
