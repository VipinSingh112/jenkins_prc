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

import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFive;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningExclusiveLicFormFive. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningExclusiveLicFormFiveLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFiveLocalService
 * @generated
 */
public class MiningExclusiveLicFormFiveLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningExclusiveLicFormFiveLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining exclusive lic form five to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was added
	 */
	public static MiningExclusiveLicFormFive addMiningExclusiveLicFormFive(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return getService().addMiningExclusiveLicFormFive(
			miningExclusiveLicFormFive);
	}

	/**
	 * Creates a new mining exclusive lic form five with the primary key. Does not add the mining exclusive lic form five to the database.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key for the new mining exclusive lic form five
	 * @return the new mining exclusive lic form five
	 */
	public static MiningExclusiveLicFormFive createMiningExclusiveLicFormFive(
		long miningExclusiveLicFormFiveId) {

		return getService().createMiningExclusiveLicFormFive(
			miningExclusiveLicFormFiveId);
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
	 * Deletes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws PortalException if a mining exclusive lic form five with the primary key could not be found
	 */
	public static MiningExclusiveLicFormFive deleteMiningExclusiveLicFormFive(
			long miningExclusiveLicFormFiveId)
		throws PortalException {

		return getService().deleteMiningExclusiveLicFormFive(
			miningExclusiveLicFormFiveId);
	}

	/**
	 * Deletes the mining exclusive lic form five from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 */
	public static MiningExclusiveLicFormFive deleteMiningExclusiveLicFormFive(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return getService().deleteMiningExclusiveLicFormFive(
			miningExclusiveLicFormFive);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
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

	public static MiningExclusiveLicFormFive fetchMiningExclusiveLicFormFive(
		long miningExclusiveLicFormFiveId) {

		return getService().fetchMiningExclusiveLicFormFive(
			miningExclusiveLicFormFiveId);
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

	public static MiningExclusiveLicFormFive getMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningExclusiveLicFormFiveException {

		return getService().getMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws PortalException if a mining exclusive lic form five with the primary key could not be found
	 */
	public static MiningExclusiveLicFormFive getMiningExclusiveLicFormFive(
			long miningExclusiveLicFormFiveId)
		throws PortalException {

		return getService().getMiningExclusiveLicFormFive(
			miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns a range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @return the range of mining exclusive lic form fives
	 */
	public static List<MiningExclusiveLicFormFive>
		getMiningExclusiveLicFormFives(int start, int end) {

		return getService().getMiningExclusiveLicFormFives(start, end);
	}

	/**
	 * Returns the number of mining exclusive lic form fives.
	 *
	 * @return the number of mining exclusive lic form fives
	 */
	public static int getMiningExclusiveLicFormFivesCount() {
		return getService().getMiningExclusiveLicFormFivesCount();
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
	 * Updates the mining exclusive lic form five in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningExclusiveLicFormFiveLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was updated
	 */
	public static MiningExclusiveLicFormFive updateMiningExclusiveLicFormFive(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return getService().updateMiningExclusiveLicFormFive(
			miningExclusiveLicFormFive);
	}

	public static MiningExclusiveLicFormFiveLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningExclusiveLicFormFiveLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningExclusiveLicFormFiveLocalServiceUtil.class,
			MiningExclusiveLicFormFiveLocalService.class);

}