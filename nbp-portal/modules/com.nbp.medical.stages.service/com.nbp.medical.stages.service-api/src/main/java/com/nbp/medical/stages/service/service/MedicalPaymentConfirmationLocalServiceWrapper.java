/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationLocalService
 * @generated
 */
public class MedicalPaymentConfirmationLocalServiceWrapper
	implements MedicalPaymentConfirmationLocalService,
			   ServiceWrapper<MedicalPaymentConfirmationLocalService> {

	public MedicalPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public MedicalPaymentConfirmationLocalServiceWrapper(
		MedicalPaymentConfirmationLocalService
			medicalPaymentConfirmationLocalService) {

		_medicalPaymentConfirmationLocalService =
			medicalPaymentConfirmationLocalService;
	}

	/**
	 * Adds the medical payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was added
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		addMedicalPaymentConfirmation(
			com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
				medicalPaymentConfirmation) {

		return _medicalPaymentConfirmationLocalService.
			addMedicalPaymentConfirmation(medicalPaymentConfirmation);
	}

	/**
	 * Creates a new medical payment confirmation with the primary key. Does not add the medical payment confirmation to the database.
	 *
	 * @param medicalPaymentConfirmationId the primary key for the new medical payment confirmation
	 * @return the new medical payment confirmation
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		createMedicalPaymentConfirmation(long medicalPaymentConfirmationId) {

		return _medicalPaymentConfirmationLocalService.
			createMedicalPaymentConfirmation(medicalPaymentConfirmationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
			deleteMedicalPaymentConfirmation(long medicalPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPaymentConfirmationLocalService.
			deleteMedicalPaymentConfirmation(medicalPaymentConfirmationId);
	}

	/**
	 * Deletes the medical payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		deleteMedicalPaymentConfirmation(
			com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
				medicalPaymentConfirmation) {

		return _medicalPaymentConfirmationLocalService.
			deleteMedicalPaymentConfirmation(medicalPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalPaymentConfirmationLocalService.dynamicQuery();
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

		return _medicalPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
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

		return _medicalPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
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

		return _medicalPaymentConfirmationLocalService.dynamicQuery(
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

		return _medicalPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _medicalPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		fetchMedicalPaymentConfirmation(long medicalPaymentConfirmationId) {

		return _medicalPaymentConfirmationLocalService.
			fetchMedicalPaymentConfirmation(medicalPaymentConfirmationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalPaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalPaymentConfirmation>
			getMedicalPayConfBy_CI(String caseId) {

		return _medicalPaymentConfirmationLocalService.getMedicalPayConfBy_CI(
			caseId);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
			getMedicalPaymentConfBy_CI(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalPaymentConfirmationException {

		return _medicalPaymentConfirmationLocalService.
			getMedicalPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the medical payment confirmation with the primary key.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
			getMedicalPaymentConfirmation(long medicalPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPaymentConfirmationLocalService.
			getMedicalPaymentConfirmation(medicalPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of medical payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalPaymentConfirmation>
			getMedicalPaymentConfirmations(int start, int end) {

		return _medicalPaymentConfirmationLocalService.
			getMedicalPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of medical payment confirmations.
	 *
	 * @return the number of medical payment confirmations
	 */
	@Override
	public int getMedicalPaymentConfirmationsCount() {
		return _medicalPaymentConfirmationLocalService.
			getMedicalPaymentConfirmationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalPaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was updated
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		updateMedicalPaymentConfirmation(
			com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
				medicalPaymentConfirmation) {

		return _medicalPaymentConfirmationLocalService.
			updateMedicalPaymentConfirmation(medicalPaymentConfirmation);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalPaymentConfirmation
		updateMedicalPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _medicalPaymentConfirmationLocalService.
			updateMedicalPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public MedicalPaymentConfirmationLocalService getWrappedService() {
		return _medicalPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalPaymentConfirmationLocalService
			medicalPaymentConfirmationLocalService) {

		_medicalPaymentConfirmationLocalService =
			medicalPaymentConfirmationLocalService;
	}

	private MedicalPaymentConfirmationLocalService
		_medicalPaymentConfirmationLocalService;

}