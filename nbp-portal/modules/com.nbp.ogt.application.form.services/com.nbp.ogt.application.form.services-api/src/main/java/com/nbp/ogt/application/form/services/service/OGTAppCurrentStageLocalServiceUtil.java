/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OGTAppCurrentStage. This utility wraps
 * <code>com.nbp.ogt.application.form.services.service.impl.OGTAppCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStageLocalService
 * @generated
 */
public class OGTAppCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.application.form.services.service.impl.OGTAppCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt app current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was added
	 */
	public static OGTAppCurrentStage addOGTAppCurrentStage(
		OGTAppCurrentStage ogtAppCurrentStage) {

		return getService().addOGTAppCurrentStage(ogtAppCurrentStage);
	}

	/**
	 * Creates a new ogt app current stage with the primary key. Does not add the ogt app current stage to the database.
	 *
	 * @param ogtAppCurrentStageId the primary key for the new ogt app current stage
	 * @return the new ogt app current stage
	 */
	public static OGTAppCurrentStage createOGTAppCurrentStage(
		long ogtAppCurrentStageId) {

		return getService().createOGTAppCurrentStage(ogtAppCurrentStageId);
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
	 * Deletes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws PortalException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage deleteOGTAppCurrentStage(
			long ogtAppCurrentStageId)
		throws PortalException {

		return getService().deleteOGTAppCurrentStage(ogtAppCurrentStageId);
	}

	/**
	 * Deletes the ogt app current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was removed
	 */
	public static OGTAppCurrentStage deleteOGTAppCurrentStage(
		OGTAppCurrentStage ogtAppCurrentStage) {

		return getService().deleteOGTAppCurrentStage(ogtAppCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
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

	public static OGTAppCurrentStage fetchOGTAppCurrentStage(
		long ogtAppCurrentStageId) {

		return getService().fetchOGTAppCurrentStage(ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage matching the UUID and group.
	 *
	 * @param uuid the ogt app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchOGTAppCurrentStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchOGTAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static OGTAppCurrentStage getByOGT_Stage(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getService().getByOGT_Stage(ogtApplicationId);
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
	 * Returns the ogt app current stage with the primary key.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws PortalException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage getOGTAppCurrentStage(
			long ogtAppCurrentStageId)
		throws PortalException {

		return getService().getOGTAppCurrentStage(ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage matching the UUID and group.
	 *
	 * @param uuid the ogt app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt app current stage
	 * @throws PortalException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage getOGTAppCurrentStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getOGTAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of ogt app current stages
	 */
	public static List<OGTAppCurrentStage> getOGTAppCurrentStages(
		int start, int end) {

		return getService().getOGTAppCurrentStages(start, end);
	}

	/**
	 * Returns all the ogt app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt app current stages
	 * @param companyId the primary key of the company
	 * @return the matching ogt app current stages, or an empty list if no matches were found
	 */
	public static List<OGTAppCurrentStage>
		getOGTAppCurrentStagesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOGTAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of ogt app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt app current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ogt app current stages, or an empty list if no matches were found
	 */
	public static List<OGTAppCurrentStage>
		getOGTAppCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getService().getOGTAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ogt app current stages.
	 *
	 * @return the number of ogt app current stages
	 */
	public static int getOGTAppCurrentStagesCount() {
		return getService().getOGTAppCurrentStagesCount();
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
	 * Updates the ogt app current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OGTAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 * @return the ogt app current stage that was updated
	 */
	public static OGTAppCurrentStage updateOGTAppCurrentStage(
		OGTAppCurrentStage ogtAppCurrentStage) {

		return getService().updateOGTAppCurrentStage(ogtAppCurrentStage);
	}

	public static OGTAppCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OGTAppCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			OGTAppCurrentStageLocalServiceUtil.class,
			OGTAppCurrentStageLocalService.class);

}