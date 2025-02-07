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

import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningProspectingLicenseAdd. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningProspectingLicenseAddLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAddLocalService
 * @generated
 */
public class MiningProspectingLicenseAddLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningProspectingLicenseAddLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining prospecting license add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was added
	 */
	public static MiningProspectingLicenseAdd addMiningProspectingLicenseAdd(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return getService().addMiningProspectingLicenseAdd(
			miningProspectingLicenseAdd);
	}

	/**
	 * Creates a new mining prospecting license add with the primary key. Does not add the mining prospecting license add to the database.
	 *
	 * @param miningProspectingLicenseAddId the primary key for the new mining prospecting license add
	 * @return the new mining prospecting license add
	 */
	public static MiningProspectingLicenseAdd createMiningProspectingLicenseAdd(
		long miningProspectingLicenseAddId) {

		return getService().createMiningProspectingLicenseAdd(
			miningProspectingLicenseAddId);
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
	 * Deletes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws PortalException if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd deleteMiningProspectingLicenseAdd(
			long miningProspectingLicenseAddId)
		throws PortalException {

		return getService().deleteMiningProspectingLicenseAdd(
			miningProspectingLicenseAddId);
	}

	/**
	 * Deletes the mining prospecting license add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 */
	public static MiningProspectingLicenseAdd deleteMiningProspectingLicenseAdd(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return getService().deleteMiningProspectingLicenseAdd(
			miningProspectingLicenseAdd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
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

	public static MiningProspectingLicenseAdd fetchMiningProspectingLicenseAdd(
		long miningProspectingLicenseAddId) {

		return getService().fetchMiningProspectingLicenseAdd(
			miningProspectingLicenseAddId);
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
	 * Returns the mining prospecting license add with the primary key.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws PortalException if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd getMiningProspectingLicenseAdd(
			long miningProspectingLicenseAddId)
		throws PortalException {

		return getService().getMiningProspectingLicenseAdd(
			miningProspectingLicenseAddId);
	}

	/**
	 * Returns a range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd>
		getMiningProspectingLicenseAdds(int start, int end) {

		return getService().getMiningProspectingLicenseAdds(start, end);
	}

	/**
	 * Returns the number of mining prospecting license adds.
	 *
	 * @return the number of mining prospecting license adds
	 */
	public static int getMiningProspectingLicenseAddsCount() {
		return getService().getMiningProspectingLicenseAddsCount();
	}

	public static List<MiningProspectingLicenseAdd> getMinningById(
		long miningLeaseApplicationId) {

		return getService().getMinningById(miningLeaseApplicationId);
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
	 * Updates the mining prospecting license add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingLicenseAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 * @return the mining prospecting license add that was updated
	 */
	public static MiningProspectingLicenseAdd updateMiningProspectingLicenseAdd(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return getService().updateMiningProspectingLicenseAdd(
			miningProspectingLicenseAdd);
	}

	public static MiningProspectingLicenseAddLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningProspectingLicenseAddLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningProspectingLicenseAddLocalServiceUtil.class,
			MiningProspectingLicenseAddLocalService.class);

}