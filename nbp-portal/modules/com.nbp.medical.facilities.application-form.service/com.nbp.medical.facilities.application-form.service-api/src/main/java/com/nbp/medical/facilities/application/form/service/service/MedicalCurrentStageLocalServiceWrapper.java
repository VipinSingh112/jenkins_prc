/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCurrentStageLocalService
 * @generated
 */
public class MedicalCurrentStageLocalServiceWrapper
	implements MedicalCurrentStageLocalService,
			   ServiceWrapper<MedicalCurrentStageLocalService> {

	public MedicalCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public MedicalCurrentStageLocalServiceWrapper(
		MedicalCurrentStageLocalService medicalCurrentStageLocalService) {

		_medicalCurrentStageLocalService = medicalCurrentStageLocalService;
	}

	/**
	 * Adds the medical current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCurrentStage the medical current stage
	 * @return the medical current stage that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage addMedicalCurrentStage(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalCurrentStage medicalCurrentStage) {

		return _medicalCurrentStageLocalService.addMedicalCurrentStage(
			medicalCurrentStage);
	}

	/**
	 * Creates a new medical current stage with the primary key. Does not add the medical current stage to the database.
	 *
	 * @param medicalCurrentStageId the primary key for the new medical current stage
	 * @return the new medical current stage
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage createMedicalCurrentStage(
			long medicalCurrentStageId) {

		return _medicalCurrentStageLocalService.createMedicalCurrentStage(
			medicalCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage that was removed
	 * @throws PortalException if a medical current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage deleteMedicalCurrentStage(
				long medicalCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.deleteMedicalCurrentStage(
			medicalCurrentStageId);
	}

	/**
	 * Deletes the medical current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCurrentStage the medical current stage
	 * @return the medical current stage that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage deleteMedicalCurrentStage(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalCurrentStage medicalCurrentStage) {

		return _medicalCurrentStageLocalService.deleteMedicalCurrentStage(
			medicalCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalCurrentStageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _medicalCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _medicalCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _medicalCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _medicalCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _medicalCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage fetchMedicalCurrentStage(
			long medicalCurrentStageId) {

		return _medicalCurrentStageLocalService.fetchMedicalCurrentStage(
			medicalCurrentStageId);
	}

	/**
	 * Returns the medical current stage matching the UUID and group.
	 *
	 * @param uuid the medical current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage fetchMedicalCurrentStageByUuidAndGroupId(
			String uuid, long groupId) {

		return _medicalCurrentStageLocalService.
			fetchMedicalCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage getByMED_Stage(long medicalApplicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalCurrentStageException {

		return _medicalCurrentStageLocalService.getByMED_Stage(
			medicalApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalCurrentStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medical current stage with the primary key.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage
	 * @throws PortalException if a medical current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage getMedicalCurrentStage(long medicalCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.getMedicalCurrentStage(
			medicalCurrentStageId);
	}

	/**
	 * Returns the medical current stage matching the UUID and group.
	 *
	 * @param uuid the medical current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical current stage
	 * @throws PortalException if a matching medical current stage could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage getMedicalCurrentStageByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.
			getMedicalCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of medical current stages
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalCurrentStage> getMedicalCurrentStages(int start, int end) {

		return _medicalCurrentStageLocalService.getMedicalCurrentStages(
			start, end);
	}

	/**
	 * Returns all the medical current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical current stages
	 * @param companyId the primary key of the company
	 * @return the matching medical current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalCurrentStage> getMedicalCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _medicalCurrentStageLocalService.
			getMedicalCurrentStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalCurrentStage> getMedicalCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.medical.facilities.application.form.service.model.
						MedicalCurrentStage> orderByComparator) {

		return _medicalCurrentStageLocalService.
			getMedicalCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical current stages.
	 *
	 * @return the number of medical current stages
	 */
	@Override
	public int getMedicalCurrentStagesCount() {
		return _medicalCurrentStageLocalService.getMedicalCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCurrentStage the medical current stage
	 * @return the medical current stage that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalCurrentStage updateMedicalCurrentStage(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalCurrentStage medicalCurrentStage) {

		return _medicalCurrentStageLocalService.updateMedicalCurrentStage(
			medicalCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public MedicalCurrentStageLocalService getWrappedService() {
		return _medicalCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalCurrentStageLocalService medicalCurrentStageLocalService) {

		_medicalCurrentStageLocalService = medicalCurrentStageLocalService;
	}

	private MedicalCurrentStageLocalService _medicalCurrentStageLocalService;

}