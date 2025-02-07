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

import com.nbp.mining.lease.application.service.model.MiningProspectingRights;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningProspectingRights. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningProspectingRightsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsLocalService
 * @generated
 */
public class MiningProspectingRightsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningProspectingRightsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining prospecting rights to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was added
	 */
	public static MiningProspectingRights addMiningProspectingRights(
		MiningProspectingRights miningProspectingRights) {

		return getService().addMiningProspectingRights(miningProspectingRights);
	}

	/**
	 * Creates a new mining prospecting rights with the primary key. Does not add the mining prospecting rights to the database.
	 *
	 * @param prospectingRightsId the primary key for the new mining prospecting rights
	 * @return the new mining prospecting rights
	 */
	public static MiningProspectingRights createMiningProspectingRights(
		long prospectingRightsId) {

		return getService().createMiningProspectingRights(prospectingRightsId);
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
	 * Deletes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws PortalException if a mining prospecting rights with the primary key could not be found
	 */
	public static MiningProspectingRights deleteMiningProspectingRights(
			long prospectingRightsId)
		throws PortalException {

		return getService().deleteMiningProspectingRights(prospectingRightsId);
	}

	/**
	 * Deletes the mining prospecting rights from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 */
	public static MiningProspectingRights deleteMiningProspectingRights(
		MiningProspectingRights miningProspectingRights) {

		return getService().deleteMiningProspectingRights(
			miningProspectingRights);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
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

	public static MiningProspectingRights fetchMiningProspectingRights(
		long prospectingRightsId) {

		return getService().fetchMiningProspectingRights(prospectingRightsId);
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

	public static MiningProspectingRights getMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingRightsException {

		return getService().getMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting rights with the primary key.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws PortalException if a mining prospecting rights with the primary key could not be found
	 */
	public static MiningProspectingRights getMiningProspectingRights(
			long prospectingRightsId)
		throws PortalException {

		return getService().getMiningProspectingRights(prospectingRightsId);
	}

	/**
	 * Returns a range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @return the range of mining prospecting rightses
	 */
	public static List<MiningProspectingRights> getMiningProspectingRightses(
		int start, int end) {

		return getService().getMiningProspectingRightses(start, end);
	}

	/**
	 * Returns the number of mining prospecting rightses.
	 *
	 * @return the number of mining prospecting rightses
	 */
	public static int getMiningProspectingRightsesCount() {
		return getService().getMiningProspectingRightsesCount();
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
	 * Updates the mining prospecting rights in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningProspectingRightsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 * @return the mining prospecting rights that was updated
	 */
	public static MiningProspectingRights updateMiningProspectingRights(
		MiningProspectingRights miningProspectingRights) {

		return getService().updateMiningProspectingRights(
			miningProspectingRights);
	}

	public static MiningProspectingRightsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningProspectingRightsLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningProspectingRightsLocalServiceUtil.class,
			MiningProspectingRightsLocalService.class);

}