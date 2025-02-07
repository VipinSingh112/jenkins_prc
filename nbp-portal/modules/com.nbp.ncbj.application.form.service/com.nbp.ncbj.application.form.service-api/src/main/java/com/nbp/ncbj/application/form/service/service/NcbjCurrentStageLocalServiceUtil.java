/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjCurrentStage. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCurrentStageLocalService
 * @generated
 */
public class NcbjCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was added
	 */
	public static NcbjCurrentStage addNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		return getService().addNcbjCurrentStage(ncbjCurrentStage);
	}

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	public static NcbjCurrentStage createNcbjCurrentStage(
		long ncbjCurrentStageId) {

		return getService().createNcbjCurrentStage(ncbjCurrentStageId);
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
	 * Deletes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage deleteNcbjCurrentStage(
			long ncbjCurrentStageId)
		throws PortalException {

		return getService().deleteNcbjCurrentStage(ncbjCurrentStageId);
	}

	/**
	 * Deletes the ncbj current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was removed
	 */
	public static NcbjCurrentStage deleteNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		return getService().deleteNcbjCurrentStage(ncbjCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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

	public static NcbjCurrentStage fetchNcbjCurrentStage(
		long ncbjCurrentStageId) {

		return getService().fetchNcbjCurrentStage(ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchNcbjCurrentStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchNcbjCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static NcbjCurrentStage getByNcbj_Stage(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getService().getByNcbj_Stage(ncbjApplicationId);
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
	 * Returns the ncbj current stage with the primary key.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage getNcbjCurrentStage(long ncbjCurrentStageId)
		throws PortalException {

		return getService().getNcbjCurrentStage(ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage
	 * @throws PortalException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage getNcbjCurrentStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getNcbjCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	public static List<NcbjCurrentStage> getNcbjCurrentStages(
		int start, int end) {

		return getService().getNcbjCurrentStages(start, end);
	}

	/**
	 * Returns all the ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @return the matching ncbj current stages, or an empty list if no matches were found
	 */
	public static List<NcbjCurrentStage> getNcbjCurrentStagesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getNcbjCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj current stages, or an empty list if no matches were found
	 */
	public static List<NcbjCurrentStage> getNcbjCurrentStagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getService().getNcbjCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	public static int getNcbjCurrentStagesCount() {
		return getService().getNcbjCurrentStagesCount();
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
	 * Updates the ncbj current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was updated
	 */
	public static NcbjCurrentStage updateNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		return getService().updateNcbjCurrentStage(ncbjCurrentStage);
	}

	public static NcbjCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjCurrentStageLocalServiceUtil.class,
			NcbjCurrentStageLocalService.class);

}