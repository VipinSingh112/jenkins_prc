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

import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningFormFiveDelineation. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningFormFiveDelineationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationLocalService
 * @generated
 */
public class MiningFormFiveDelineationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningFormFiveDelineationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining form five delineation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was added
	 */
	public static MiningFormFiveDelineation addMiningFormFiveDelineation(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return getService().addMiningFormFiveDelineation(
			miningFormFiveDelineation);
	}

	/**
	 * Creates a new mining form five delineation with the primary key. Does not add the mining form five delineation to the database.
	 *
	 * @param miningFormFiveDelineationId the primary key for the new mining form five delineation
	 * @return the new mining form five delineation
	 */
	public static MiningFormFiveDelineation createMiningFormFiveDelineation(
		long miningFormFiveDelineationId) {

		return getService().createMiningFormFiveDelineation(
			miningFormFiveDelineationId);
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
	 * Deletes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws PortalException if a mining form five delineation with the primary key could not be found
	 */
	public static MiningFormFiveDelineation deleteMiningFormFiveDelineation(
			long miningFormFiveDelineationId)
		throws PortalException {

		return getService().deleteMiningFormFiveDelineation(
			miningFormFiveDelineationId);
	}

	/**
	 * Deletes the mining form five delineation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was removed
	 */
	public static MiningFormFiveDelineation deleteMiningFormFiveDelineation(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return getService().deleteMiningFormFiveDelineation(
			miningFormFiveDelineation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
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

	public static MiningFormFiveDelineation fetchMiningFormFiveDelineation(
		long miningFormFiveDelineationId) {

		return getService().fetchMiningFormFiveDelineation(
			miningFormFiveDelineationId);
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

	public static MiningFormFiveDelineation getMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningFormFiveDelineationException {

		return getService().getMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining form five delineation with the primary key.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws PortalException if a mining form five delineation with the primary key could not be found
	 */
	public static MiningFormFiveDelineation getMiningFormFiveDelineation(
			long miningFormFiveDelineationId)
		throws PortalException {

		return getService().getMiningFormFiveDelineation(
			miningFormFiveDelineationId);
	}

	/**
	 * Returns a range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @return the range of mining form five delineations
	 */
	public static List<MiningFormFiveDelineation> getMiningFormFiveDelineations(
		int start, int end) {

		return getService().getMiningFormFiveDelineations(start, end);
	}

	/**
	 * Returns the number of mining form five delineations.
	 *
	 * @return the number of mining form five delineations
	 */
	public static int getMiningFormFiveDelineationsCount() {
		return getService().getMiningFormFiveDelineationsCount();
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
	 * Updates the mining form five delineation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningFormFiveDelineationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 * @return the mining form five delineation that was updated
	 */
	public static MiningFormFiveDelineation updateMiningFormFiveDelineation(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return getService().updateMiningFormFiveDelineation(
			miningFormFiveDelineation);
	}

	public static MiningFormFiveDelineationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningFormFiveDelineationLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningFormFiveDelineationLocalServiceUtil.class,
			MiningFormFiveDelineationLocalService.class);

}