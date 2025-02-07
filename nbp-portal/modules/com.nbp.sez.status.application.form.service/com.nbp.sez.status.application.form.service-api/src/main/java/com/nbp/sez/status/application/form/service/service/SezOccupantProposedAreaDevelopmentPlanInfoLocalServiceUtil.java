/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezOccupantProposedAreaDevelopmentPlanInfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfoLocalService
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez occupant proposed area development plan info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was added
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		addSezOccupantProposedAreaDevelopmentPlanInfo(
			SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo) {

		return getService().addSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccupantProposedAreaDevelopmentPlanInfo);
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
	 * Creates a new sez occupant proposed area development plan info with the primary key. Does not add the sez occupant proposed area development plan info to the database.
	 *
	 * @param sezOccPropAreaId the primary key for the new sez occupant proposed area development plan info
	 * @return the new sez occupant proposed area development plan info
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		createSezOccupantProposedAreaDevelopmentPlanInfo(
			long sezOccPropAreaId) {

		return getService().createSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccPropAreaId);
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
	 * Deletes the sez occupant proposed area development plan info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 * @throws PortalException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
			deleteSezOccupantProposedAreaDevelopmentPlanInfo(
				long sezOccPropAreaId)
		throws PortalException {

		return getService().deleteSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccPropAreaId);
	}

	/**
	 * Deletes the sez occupant proposed area development plan info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		deleteSezOccupantProposedAreaDevelopmentPlanInfo(
			SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo) {

		return getService().deleteSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccupantProposedAreaDevelopmentPlanInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
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

	public static SezOccupantProposedAreaDevelopmentPlanInfo
		fetchSezOccupantProposedAreaDevelopmentPlanInfo(long sezOccPropAreaId) {

		return getService().fetchSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccPropAreaId);
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
	 * Returns the sez occupant proposed area development plan info with the primary key.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info
	 * @throws PortalException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
			getSezOccupantProposedAreaDevelopmentPlanInfo(long sezOccPropAreaId)
		throws PortalException {

		return getService().getSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccPropAreaId);
	}

	/**
	 * Returns a range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @return the range of sez occupant proposed area development plan infos
	 */
	public static List<SezOccupantProposedAreaDevelopmentPlanInfo>
		getSezOccupantProposedAreaDevelopmentPlanInfos(int start, int end) {

		return getService().getSezOccupantProposedAreaDevelopmentPlanInfos(
			start, end);
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos.
	 *
	 * @return the number of sez occupant proposed area development plan infos
	 */
	public static int getSezOccupantProposedAreaDevelopmentPlanInfosCount() {
		return getService().
			getSezOccupantProposedAreaDevelopmentPlanInfosCount();
	}

	public static SezOccupantProposedAreaDevelopmentPlanInfo getSezStatusBy_Id(
			long sezApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return getService().getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant proposed area development plan info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was updated
	 */
	public static SezOccupantProposedAreaDevelopmentPlanInfo
		updateSezOccupantProposedAreaDevelopmentPlanInfo(
			SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo) {

		return getService().updateSezOccupantProposedAreaDevelopmentPlanInfo(
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	public static SezOccupantProposedAreaDevelopmentPlanInfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<SezOccupantProposedAreaDevelopmentPlanInfoLocalService>
			_serviceSnapshot = new Snapshot<>(
				SezOccupantProposedAreaDevelopmentPlanInfoLocalServiceUtil.
					class,
				SezOccupantProposedAreaDevelopmentPlanInfoLocalService.class);

}