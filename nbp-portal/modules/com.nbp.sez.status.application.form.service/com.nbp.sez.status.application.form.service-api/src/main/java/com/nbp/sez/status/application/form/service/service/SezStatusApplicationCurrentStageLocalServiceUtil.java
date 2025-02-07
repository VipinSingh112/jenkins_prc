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

import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusApplicationCurrentStage. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezStatusApplicationCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStageLocalService
 * @generated
 */
public class SezStatusApplicationCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezStatusApplicationCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was added
	 */
	public static SezStatusApplicationCurrentStage
		addSezStatusApplicationCurrentStage(
			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		return getService().addSezStatusApplicationCurrentStage(
			sezStatusApplicationCurrentStage);
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
	 * Creates a new sez status application current stage with the primary key. Does not add the sez status application current stage to the database.
	 *
	 * @param sezStageId the primary key for the new sez status application current stage
	 * @return the new sez status application current stage
	 */
	public static SezStatusApplicationCurrentStage
		createSezStatusApplicationCurrentStage(long sezStageId) {

		return getService().createSezStatusApplicationCurrentStage(sezStageId);
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
	 * Deletes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws PortalException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage
			deleteSezStatusApplicationCurrentStage(long sezStageId)
		throws PortalException {

		return getService().deleteSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Deletes the sez status application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was removed
	 */
	public static SezStatusApplicationCurrentStage
		deleteSezStatusApplicationCurrentStage(
			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		return getService().deleteSezStatusApplicationCurrentStage(
			sezStatusApplicationCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
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

	public static SezStatusApplicationCurrentStage
		fetchSezStatusApplicationCurrentStage(long sezStageId) {

		return getService().fetchSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Returns the sez status application current stage matching the UUID and group.
	 *
	 * @param uuid the sez status application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage
		fetchSezStatusApplicationCurrentStageByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchSezStatusApplicationCurrentStageByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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

	public static SezStatusApplicationCurrentStage getSEZ_Stage_SAI(
			long sezApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getService().getSEZ_Stage_SAI(sezApplicationId);
	}

	/**
	 * Returns the sez status application current stage with the primary key.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws PortalException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage
			getSezStatusApplicationCurrentStage(long sezStageId)
		throws PortalException {

		return getService().getSezStatusApplicationCurrentStage(sezStageId);
	}

	/**
	 * Returns the sez status application current stage matching the UUID and group.
	 *
	 * @param uuid the sez status application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application current stage
	 * @throws PortalException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage
			getSezStatusApplicationCurrentStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getSezStatusApplicationCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage>
		getSezStatusApplicationCurrentStages(int start, int end) {

		return getService().getSezStatusApplicationCurrentStages(start, end);
	}

	/**
	 * Returns all the sez status application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application current stages
	 * @param companyId the primary key of the company
	 * @return the matching sez status application current stages, or an empty list if no matches were found
	 */
	public static List<SezStatusApplicationCurrentStage>
		getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of sez status application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status application current stages, or an empty list if no matches were found
	 */
	public static List<SezStatusApplicationCurrentStage>
		getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator) {

		return getService().
			getSezStatusApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status application current stages.
	 *
	 * @return the number of sez status application current stages
	 */
	public static int getSezStatusApplicationCurrentStagesCount() {
		return getService().getSezStatusApplicationCurrentStagesCount();
	}

	/**
	 * Updates the sez status application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 * @return the sez status application current stage that was updated
	 */
	public static SezStatusApplicationCurrentStage
		updateSezStatusApplicationCurrentStage(
			SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		return getService().updateSezStatusApplicationCurrentStage(
			sezStatusApplicationCurrentStage);
	}

	public static SezStatusApplicationCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusApplicationCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusApplicationCurrentStageLocalServiceUtil.class,
			SezStatusApplicationCurrentStageLocalService.class);

}