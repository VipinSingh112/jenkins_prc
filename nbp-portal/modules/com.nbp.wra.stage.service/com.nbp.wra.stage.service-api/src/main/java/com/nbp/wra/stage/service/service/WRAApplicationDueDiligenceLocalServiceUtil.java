/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WRAApplicationDueDiligence. This utility wraps
 * <code>com.nbp.wra.stage.service.service.impl.WRAApplicationDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligenceLocalService
 * @generated
 */
public class WRAApplicationDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.stage.service.service.impl.WRAApplicationDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was added
	 */
	public static WRAApplicationDueDiligence addWRAApplicationDueDiligence(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return getService().addWRAApplicationDueDiligence(
			wraApplicationDueDiligence);
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
	 * Creates a new wra application due diligence with the primary key. Does not add the wra application due diligence to the database.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key for the new wra application due diligence
	 * @return the new wra application due diligence
	 */
	public static WRAApplicationDueDiligence createWRAApplicationDueDiligence(
		long wRAApplicationDueDiligenceId) {

		return getService().createWRAApplicationDueDiligence(
			wRAApplicationDueDiligenceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws PortalException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence deleteWRAApplicationDueDiligence(
			long wRAApplicationDueDiligenceId)
		throws PortalException {

		return getService().deleteWRAApplicationDueDiligence(
			wRAApplicationDueDiligenceId);
	}

	/**
	 * Deletes the wra application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was removed
	 */
	public static WRAApplicationDueDiligence deleteWRAApplicationDueDiligence(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return getService().deleteWRAApplicationDueDiligence(
			wraApplicationDueDiligence);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
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

	public static WRAApplicationDueDiligence fetchWRAApplicationDueDiligence(
		long wRAApplicationDueDiligenceId) {

		return getService().fetchWRAApplicationDueDiligence(
			wRAApplicationDueDiligenceId);
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

	/**
	 * Returns the wra application due diligence with the primary key.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws PortalException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence getWRAApplicationDueDiligence(
			long wRAApplicationDueDiligenceId)
		throws PortalException {

		return getService().getWRAApplicationDueDiligence(
			wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns a range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence>
		getWRAApplicationDueDiligences(int start, int end) {

		return getService().getWRAApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of wra application due diligences.
	 *
	 * @return the number of wra application due diligences
	 */
	public static int getWRAApplicationDueDiligencesCount() {
		return getService().getWRAApplicationDueDiligencesCount();
	}

	public static WRAApplicationDueDiligence getWRApplicationDueDiligenceByCI(
		String caseId) {

		return getService().getWRApplicationDueDiligenceByCI(caseId);
	}

	/**
	 * Updates the wra application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 * @return the wra application due diligence that was updated
	 */
	public static WRAApplicationDueDiligence updateWRAApplicationDueDiligence(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return getService().updateWRAApplicationDueDiligence(
			wraApplicationDueDiligence);
	}

	public static WRAApplicationDueDiligence updateWRApplicationDueDiligence(
		String caseId, String agencyName, String status, String agencyDecision,
		String feedback) {

		return getService().updateWRApplicationDueDiligence(
			caseId, agencyName, status, agencyDecision, feedback);
	}

	public static WRAApplicationDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WRAApplicationDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			WRAApplicationDueDiligenceLocalServiceUtil.class,
			WRAApplicationDueDiligenceLocalService.class);

}