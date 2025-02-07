/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningLeaseApplication. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningLeaseApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationLocalService
 * @generated
 */
public class MiningLeaseApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningLeaseApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining lease application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was added
	 */
	public static MiningLeaseApplication addMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication) {

		return getService().addMiningLeaseApplication(miningLeaseApplication);
	}

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	public static MiningLeaseApplication createMiningLeaseApplication(
		long miningLeaseApplicationId) {

		return getService().createMiningLeaseApplication(
			miningLeaseApplicationId);
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
	 * Deletes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication deleteMiningLeaseApplication(
			long miningLeaseApplicationId)
		throws PortalException {

		return getService().deleteMiningLeaseApplication(
			miningLeaseApplicationId);
	}

	/**
	 * Deletes the mining lease application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication deleteMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication) {

		return getService().deleteMiningLeaseApplication(
			miningLeaseApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
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

	public static MiningLeaseApplication fetchMiningLeaseApplication(
		long miningLeaseApplicationId) {

		return getService().fetchMiningLeaseApplication(
			miningLeaseApplicationId);
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

	public static List<String> getJadscDistinctCategory() {
		return getService().getJadscDistinctCategory();
	}

	public static MiningLeaseApplication getMiningBy_PRNum_PLNum(
			String applicationNumber, String prospRightsNum)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getService().getMiningBy_PRNum_PLNum(
			applicationNumber, prospRightsNum);
	}

	public static MiningLeaseApplication getMiningByAppNum(
			String applicationNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getService().getMiningByAppNum(applicationNumber);
	}

	public static MiningLeaseApplication getMiningByCaseId(String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getService().getMiningByCaseId(caseId);
	}

	public static MiningLeaseApplication getMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getService().getMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	public static List<MiningLeaseApplication> getMiningByS_U(
		long userId, int status) {

		return getService().getMiningByS_U(userId, status);
	}

	public static List<MiningLeaseApplication> getMiningByStatus(int status) {
		return getService().getMiningByStatus(status);
	}

	public static List<String> getMiningDistinctCategory() {
		return getService().getMiningDistinctCategory();
	}

	/**
	 * Returns the mining lease application with the primary key.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws PortalException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication getMiningLeaseApplication(
			long miningLeaseApplicationId)
		throws PortalException {

		return getService().getMiningLeaseApplication(miningLeaseApplicationId);
	}

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	public static List<MiningLeaseApplication> getMiningLeaseApplications(
		int start, int end) {

		return getService().getMiningLeaseApplications(start, end);
	}

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
	 */
	public static int getMiningLeaseApplicationsCount() {
		return getService().getMiningLeaseApplicationsCount();
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

	/**
	 * Updates the mining lease application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningLeaseApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningLeaseApplication the mining lease application
	 * @return the mining lease application that was updated
	 */
	public static MiningLeaseApplication updateMiningLeaseApplication(
		MiningLeaseApplication miningLeaseApplication) {

		return getService().updateMiningLeaseApplication(
			miningLeaseApplication);
	}

	public static MiningLeaseApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningLeaseApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningLeaseApplicationLocalServiceUtil.class,
			MiningLeaseApplicationLocalService.class);

}