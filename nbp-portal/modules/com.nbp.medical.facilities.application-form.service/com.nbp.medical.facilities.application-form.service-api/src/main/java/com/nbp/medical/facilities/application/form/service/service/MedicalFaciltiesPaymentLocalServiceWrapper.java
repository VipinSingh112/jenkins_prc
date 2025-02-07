/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFaciltiesPaymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFaciltiesPaymentLocalService
 * @generated
 */
public class MedicalFaciltiesPaymentLocalServiceWrapper
	implements MedicalFaciltiesPaymentLocalService,
			   ServiceWrapper<MedicalFaciltiesPaymentLocalService> {

	public MedicalFaciltiesPaymentLocalServiceWrapper() {
		this(null);
	}

	public MedicalFaciltiesPaymentLocalServiceWrapper(
		MedicalFaciltiesPaymentLocalService
			medicalFaciltiesPaymentLocalService) {

		_medicalFaciltiesPaymentLocalService =
			medicalFaciltiesPaymentLocalService;
	}

	/**
	 * Adds the medical facilties payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment addMedicalFaciltiesPayment(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return _medicalFaciltiesPaymentLocalService.addMedicalFaciltiesPayment(
			medicalFaciltiesPayment);
	}

	/**
	 * Creates a new medical facilties payment with the primary key. Does not add the medical facilties payment to the database.
	 *
	 * @param medicalFaciltiesPaymentId the primary key for the new medical facilties payment
	 * @return the new medical facilties payment
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment createMedicalFaciltiesPayment(
			long medicalFaciltiesPaymentId) {

		return _medicalFaciltiesPaymentLocalService.
			createMedicalFaciltiesPayment(medicalFaciltiesPaymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFaciltiesPaymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws PortalException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment deleteMedicalFaciltiesPayment(
				long medicalFaciltiesPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFaciltiesPaymentLocalService.
			deleteMedicalFaciltiesPayment(medicalFaciltiesPaymentId);
	}

	/**
	 * Deletes the medical facilties payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment deleteMedicalFaciltiesPayment(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return _medicalFaciltiesPaymentLocalService.
			deleteMedicalFaciltiesPayment(medicalFaciltiesPayment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFaciltiesPaymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFaciltiesPaymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFaciltiesPaymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFaciltiesPaymentLocalService.dynamicQuery();
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

		return _medicalFaciltiesPaymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
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

		return _medicalFaciltiesPaymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
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

		return _medicalFaciltiesPaymentLocalService.dynamicQuery(
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

		return _medicalFaciltiesPaymentLocalService.dynamicQueryCount(
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

		return _medicalFaciltiesPaymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment fetchMedicalFaciltiesPayment(
			long medicalFaciltiesPaymentId) {

		return _medicalFaciltiesPaymentLocalService.
			fetchMedicalFaciltiesPayment(medicalFaciltiesPaymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFaciltiesPaymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFaciltiesPaymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment getMedicalAppById(long medicalApplicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFaciltiesPaymentException {

		return _medicalFaciltiesPaymentLocalService.getMedicalAppById(
			medicalApplicationId);
	}

	/**
	 * Returns the medical facilties payment with the primary key.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws PortalException if a medical facilties payment with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment getMedicalFaciltiesPayment(
				long medicalFaciltiesPaymentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFaciltiesPaymentLocalService.getMedicalFaciltiesPayment(
			medicalFaciltiesPaymentId);
	}

	/**
	 * Returns a range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @return the range of medical facilties payments
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFaciltiesPayment> getMedicalFaciltiesPayments(
				int start, int end) {

		return _medicalFaciltiesPaymentLocalService.getMedicalFaciltiesPayments(
			start, end);
	}

	/**
	 * Returns the number of medical facilties payments.
	 *
	 * @return the number of medical facilties payments
	 */
	@Override
	public int getMedicalFaciltiesPaymentsCount() {
		return _medicalFaciltiesPaymentLocalService.
			getMedicalFaciltiesPaymentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFaciltiesPaymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFaciltiesPaymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilties payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFaciltiesPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 * @return the medical facilties payment that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFaciltiesPayment updateMedicalFaciltiesPayment(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return _medicalFaciltiesPaymentLocalService.
			updateMedicalFaciltiesPayment(medicalFaciltiesPayment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFaciltiesPaymentLocalService.getBasePersistence();
	}

	@Override
	public MedicalFaciltiesPaymentLocalService getWrappedService() {
		return _medicalFaciltiesPaymentLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFaciltiesPaymentLocalService
			medicalFaciltiesPaymentLocalService) {

		_medicalFaciltiesPaymentLocalService =
			medicalFaciltiesPaymentLocalService;
	}

	private MedicalFaciltiesPaymentLocalService
		_medicalFaciltiesPaymentLocalService;

}