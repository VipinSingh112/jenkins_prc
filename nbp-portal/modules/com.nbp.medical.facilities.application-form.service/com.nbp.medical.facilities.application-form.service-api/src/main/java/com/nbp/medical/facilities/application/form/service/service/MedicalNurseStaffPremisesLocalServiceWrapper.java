/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalNurseStaffPremisesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesLocalService
 * @generated
 */
public class MedicalNurseStaffPremisesLocalServiceWrapper
	implements MedicalNurseStaffPremisesLocalService,
			   ServiceWrapper<MedicalNurseStaffPremisesLocalService> {

	public MedicalNurseStaffPremisesLocalServiceWrapper() {
		this(null);
	}

	public MedicalNurseStaffPremisesLocalServiceWrapper(
		MedicalNurseStaffPremisesLocalService
			medicalNurseStaffPremisesLocalService) {

		_medicalNurseStaffPremisesLocalService =
			medicalNurseStaffPremisesLocalService;
	}

	/**
	 * Adds the medical nurse staff premises to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises addMedicalNurseStaffPremises(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return _medicalNurseStaffPremisesLocalService.
			addMedicalNurseStaffPremises(medicalNurseStaffPremises);
	}

	/**
	 * Creates a new medical nurse staff premises with the primary key. Does not add the medical nurse staff premises to the database.
	 *
	 * @param medicalNurseStaffPremisesId the primary key for the new medical nurse staff premises
	 * @return the new medical nurse staff premises
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises createMedicalNurseStaffPremises(
			long medicalNurseStaffPremisesId) {

		return _medicalNurseStaffPremisesLocalService.
			createMedicalNurseStaffPremises(medicalNurseStaffPremisesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalNurseStaffPremisesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws PortalException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises deleteMedicalNurseStaffPremises(
				long medicalNurseStaffPremisesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalNurseStaffPremisesLocalService.
			deleteMedicalNurseStaffPremises(medicalNurseStaffPremisesId);
	}

	/**
	 * Deletes the medical nurse staff premises from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises deleteMedicalNurseStaffPremises(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return _medicalNurseStaffPremisesLocalService.
			deleteMedicalNurseStaffPremises(medicalNurseStaffPremises);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalNurseStaffPremisesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalNurseStaffPremisesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalNurseStaffPremisesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalNurseStaffPremisesLocalService.dynamicQuery();
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

		return _medicalNurseStaffPremisesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
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

		return _medicalNurseStaffPremisesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
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

		return _medicalNurseStaffPremisesLocalService.dynamicQuery(
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

		return _medicalNurseStaffPremisesLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _medicalNurseStaffPremisesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises fetchMedicalNurseStaffPremises(
			long medicalNurseStaffPremisesId) {

		return _medicalNurseStaffPremisesLocalService.
			fetchMedicalNurseStaffPremises(medicalNurseStaffPremisesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalNurseStaffPremisesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalNurseStaffPremisesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises getMedicalFacilities_ByAppId(
				long applicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalNurseStaffPremisesException {

		return _medicalNurseStaffPremisesLocalService.
			getMedicalFacilities_ByAppId(applicationId);
	}

	/**
	 * Returns the medical nurse staff premises with the primary key.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws PortalException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises getMedicalNurseStaffPremises(
				long medicalNurseStaffPremisesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalNurseStaffPremisesLocalService.
			getMedicalNurseStaffPremises(medicalNurseStaffPremisesId);
	}

	/**
	 * Returns a range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @return the range of medical nurse staff premiseses
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalNurseStaffPremises> getMedicalNurseStaffPremiseses(
				int start, int end) {

		return _medicalNurseStaffPremisesLocalService.
			getMedicalNurseStaffPremiseses(start, end);
	}

	/**
	 * Returns the number of medical nurse staff premiseses.
	 *
	 * @return the number of medical nurse staff premiseses
	 */
	@Override
	public int getMedicalNurseStaffPremisesesCount() {
		return _medicalNurseStaffPremisesLocalService.
			getMedicalNurseStaffPremisesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalNurseStaffPremisesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalNurseStaffPremisesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical nurse staff premises in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalNurseStaffPremises updateMedicalNurseStaffPremises(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return _medicalNurseStaffPremisesLocalService.
			updateMedicalNurseStaffPremises(medicalNurseStaffPremises);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalNurseStaffPremisesLocalService.getBasePersistence();
	}

	@Override
	public MedicalNurseStaffPremisesLocalService getWrappedService() {
		return _medicalNurseStaffPremisesLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalNurseStaffPremisesLocalService
			medicalNurseStaffPremisesLocalService) {

		_medicalNurseStaffPremisesLocalService =
			medicalNurseStaffPremisesLocalService;
	}

	private MedicalNurseStaffPremisesLocalService
		_medicalNurseStaffPremisesLocalService;

}