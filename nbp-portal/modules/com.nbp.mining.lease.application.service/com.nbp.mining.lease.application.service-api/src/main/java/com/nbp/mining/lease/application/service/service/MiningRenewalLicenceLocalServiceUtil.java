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

import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningRenewalLicence. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningRenewalLicenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicenceLocalService
 * @generated
 */
public class MiningRenewalLicenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningRenewalLicenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining renewal licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was added
	 */
	public static MiningRenewalLicence addMiningRenewalLicence(
		MiningRenewalLicence miningRenewalLicence) {

		return getService().addMiningRenewalLicence(miningRenewalLicence);
	}

	/**
	 * Creates a new mining renewal licence with the primary key. Does not add the mining renewal licence to the database.
	 *
	 * @param miningRenewalLicenceId the primary key for the new mining renewal licence
	 * @return the new mining renewal licence
	 */
	public static MiningRenewalLicence createMiningRenewalLicence(
		long miningRenewalLicenceId) {

		return getService().createMiningRenewalLicence(miningRenewalLicenceId);
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
	 * Deletes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws PortalException if a mining renewal licence with the primary key could not be found
	 */
	public static MiningRenewalLicence deleteMiningRenewalLicence(
			long miningRenewalLicenceId)
		throws PortalException {

		return getService().deleteMiningRenewalLicence(miningRenewalLicenceId);
	}

	/**
	 * Deletes the mining renewal licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was removed
	 */
	public static MiningRenewalLicence deleteMiningRenewalLicence(
		MiningRenewalLicence miningRenewalLicence) {

		return getService().deleteMiningRenewalLicence(miningRenewalLicence);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
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

	public static MiningRenewalLicence fetchMiningRenewalLicence(
		long miningRenewalLicenceId) {

		return getService().fetchMiningRenewalLicence(miningRenewalLicenceId);
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

	public static MiningRenewalLicence getMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return getService().getMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining renewal licence with the primary key.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws PortalException if a mining renewal licence with the primary key could not be found
	 */
	public static MiningRenewalLicence getMiningRenewalLicence(
			long miningRenewalLicenceId)
		throws PortalException {

		return getService().getMiningRenewalLicence(miningRenewalLicenceId);
	}

	/**
	 * Returns a range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @return the range of mining renewal licences
	 */
	public static List<MiningRenewalLicence> getMiningRenewalLicences(
		int start, int end) {

		return getService().getMiningRenewalLicences(start, end);
	}

	/**
	 * Returns the number of mining renewal licences.
	 *
	 * @return the number of mining renewal licences
	 */
	public static int getMiningRenewalLicencesCount() {
		return getService().getMiningRenewalLicencesCount();
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
	 * Updates the mining renewal licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningRenewalLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 * @return the mining renewal licence that was updated
	 */
	public static MiningRenewalLicence updateMiningRenewalLicence(
		MiningRenewalLicence miningRenewalLicence) {

		return getService().updateMiningRenewalLicence(miningRenewalLicence);
	}

	public static MiningRenewalLicenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningRenewalLicenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningRenewalLicenceLocalServiceUtil.class,
			MiningRenewalLicenceLocalService.class);

}