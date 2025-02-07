/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCCurrentStage. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCurrentStageLocalService
 * @generated
 */
public class JADSCCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was added
	 */
	public static JADSCCurrentStage addJADSCCurrentStage(
		JADSCCurrentStage jadscCurrentStage) {

		return getService().addJADSCCurrentStage(jadscCurrentStage);
	}

	/**
	 * Creates a new jadsc current stage with the primary key. Does not add the jadsc current stage to the database.
	 *
	 * @param jadscCurrentStageId the primary key for the new jadsc current stage
	 * @return the new jadsc current stage
	 */
	public static JADSCCurrentStage createJADSCCurrentStage(
		long jadscCurrentStageId) {

		return getService().createJADSCCurrentStage(jadscCurrentStageId);
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
	 * Deletes the jadsc current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was removed
	 */
	public static JADSCCurrentStage deleteJADSCCurrentStage(
		JADSCCurrentStage jadscCurrentStage) {

		return getService().deleteJADSCCurrentStage(jadscCurrentStage);
	}

	/**
	 * Deletes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws PortalException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage deleteJADSCCurrentStage(
			long jadscCurrentStageId)
		throws PortalException {

		return getService().deleteJADSCCurrentStage(jadscCurrentStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
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

	public static JADSCCurrentStage fetchJADSCCurrentStage(
		long jadscCurrentStageId) {

		return getService().fetchJADSCCurrentStage(jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage matching the UUID and group.
	 *
	 * @param uuid the jadsc current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchJADSCCurrentStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJADSCCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static JADSCCurrentStage getByJadsc_Stage(long applicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getService().getByJadsc_Stage(applicationId);
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
	 * Returns the jadsc current stage with the primary key.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws PortalException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage getJADSCCurrentStage(
			long jadscCurrentStageId)
		throws PortalException {

		return getService().getJADSCCurrentStage(jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage matching the UUID and group.
	 *
	 * @param uuid the jadsc current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc current stage
	 * @throws PortalException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage getJADSCCurrentStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of jadsc current stages
	 */
	public static List<JADSCCurrentStage> getJADSCCurrentStages(
		int start, int end) {

		return getService().getJADSCCurrentStages(start, end);
	}

	/**
	 * Returns all the jadsc current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc current stages
	 * @param companyId the primary key of the company
	 * @return the matching jadsc current stages, or an empty list if no matches were found
	 */
	public static List<JADSCCurrentStage>
		getJADSCCurrentStagesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getJADSCCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc current stages, or an empty list if no matches were found
	 */
	public static List<JADSCCurrentStage>
		getJADSCCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getService().getJADSCCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc current stages.
	 *
	 * @return the number of jadsc current stages
	 */
	public static int getJADSCCurrentStagesCount() {
		return getService().getJADSCCurrentStagesCount();
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
	 * Updates the jadsc current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 * @return the jadsc current stage that was updated
	 */
	public static JADSCCurrentStage updateJADSCCurrentStage(
		JADSCCurrentStage jadscCurrentStage) {

		return getService().updateJADSCCurrentStage(jadscCurrentStage);
	}

	public static JADSCCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCCurrentStageLocalServiceUtil.class,
			JADSCCurrentStageLocalService.class);

}