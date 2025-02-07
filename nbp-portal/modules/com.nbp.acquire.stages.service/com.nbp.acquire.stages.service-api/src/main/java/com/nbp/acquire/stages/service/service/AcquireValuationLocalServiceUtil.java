/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireValuation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireValuation. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireValuationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationLocalService
 * @generated
 */
public class AcquireValuationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireValuationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire valuation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was added
	 */
	public static AcquireValuation addAcquireValuation(
		AcquireValuation acquireValuation) {

		return getService().addAcquireValuation(acquireValuation);
	}

	/**
	 * Creates a new acquire valuation with the primary key. Does not add the acquire valuation to the database.
	 *
	 * @param acquireValuationId the primary key for the new acquire valuation
	 * @return the new acquire valuation
	 */
	public static AcquireValuation createAcquireValuation(
		long acquireValuationId) {

		return getService().createAcquireValuation(acquireValuationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acquire valuation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was removed
	 */
	public static AcquireValuation deleteAcquireValuation(
		AcquireValuation acquireValuation) {

		return getService().deleteAcquireValuation(acquireValuation);
	}

	/**
	 * Deletes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws PortalException if a acquire valuation with the primary key could not be found
	 */
	public static AcquireValuation deleteAcquireValuation(
			long acquireValuationId)
		throws PortalException {

		return getService().deleteAcquireValuation(acquireValuationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AcquireValuation fetchAcquireValuation(
		long acquireValuationId) {

		return getService().fetchAcquireValuation(acquireValuationId);
	}

	/**
	 * Returns the acquire valuation with the primary key.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws PortalException if a acquire valuation with the primary key could not be found
	 */
	public static AcquireValuation getAcquireValuation(long acquireValuationId)
		throws PortalException {

		return getService().getAcquireValuation(acquireValuationId);
	}

	public static AcquireValuation getAcquireValuationBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireValuationException {

		return getService().getAcquireValuationBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @return the range of acquire valuations
	 */
	public static List<AcquireValuation> getAcquireValuations(
		int start, int end) {

		return getService().getAcquireValuations(start, end);
	}

	/**
	 * Returns the number of acquire valuations.
	 *
	 * @return the number of acquire valuations
	 */
	public static int getAcquireValuationsCount() {
		return getService().getAcquireValuationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static AcquireValuation updateAcquireApplicationValuation(
		String caseId, String valuationStatus, String valuationFolio,
		String valuationVolume, String valuationNumber) {

		return getService().updateAcquireApplicationValuation(
			caseId, valuationStatus, valuationFolio, valuationVolume,
			valuationNumber);
	}

	/**
	 * Updates the acquire valuation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireValuationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireValuation the acquire valuation
	 * @return the acquire valuation that was updated
	 */
	public static AcquireValuation updateAcquireValuation(
		AcquireValuation acquireValuation) {

		return getService().updateAcquireValuation(acquireValuation);
	}

	public static AcquireValuationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireValuationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireValuationLocalServiceUtil.class,
			AcquireValuationLocalService.class);

}