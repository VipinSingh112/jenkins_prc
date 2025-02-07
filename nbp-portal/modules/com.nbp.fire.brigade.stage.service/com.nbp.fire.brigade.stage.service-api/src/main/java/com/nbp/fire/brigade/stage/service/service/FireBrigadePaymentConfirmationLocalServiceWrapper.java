/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadePaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePaymentConfirmationLocalService
 * @generated
 */
public class FireBrigadePaymentConfirmationLocalServiceWrapper
	implements FireBrigadePaymentConfirmationLocalService,
			   ServiceWrapper<FireBrigadePaymentConfirmationLocalService> {

	public FireBrigadePaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadePaymentConfirmationLocalServiceWrapper(
		FireBrigadePaymentConfirmationLocalService
			fireBrigadePaymentConfirmationLocalService) {

		_fireBrigadePaymentConfirmationLocalService =
			fireBrigadePaymentConfirmationLocalService;
	}

	/**
	 * Adds the fire brigade payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was added
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			addFireBrigadePaymentConfirmation(
				com.nbp.fire.brigade.stage.service.model.
					FireBrigadePaymentConfirmation
						fireBrigadePaymentConfirmation) {

		return _fireBrigadePaymentConfirmationLocalService.
			addFireBrigadePaymentConfirmation(fireBrigadePaymentConfirmation);
	}

	/**
	 * Creates a new fire brigade payment confirmation with the primary key. Does not add the fire brigade payment confirmation to the database.
	 *
	 * @param fireBrigadePaymentConfirId the primary key for the new fire brigade payment confirmation
	 * @return the new fire brigade payment confirmation
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			createFireBrigadePaymentConfirmation(
				long fireBrigadePaymentConfirId) {

		return _fireBrigadePaymentConfirmationLocalService.
			createFireBrigadePaymentConfirmation(fireBrigadePaymentConfirId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			deleteFireBrigadePaymentConfirmation(
				com.nbp.fire.brigade.stage.service.model.
					FireBrigadePaymentConfirmation
						fireBrigadePaymentConfirmation) {

		return _fireBrigadePaymentConfirmationLocalService.
			deleteFireBrigadePaymentConfirmation(
				fireBrigadePaymentConfirmation);
	}

	/**
	 * Deletes the fire brigade payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 * @throws PortalException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
				deleteFireBrigadePaymentConfirmation(
					long fireBrigadePaymentConfirId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePaymentConfirmationLocalService.
			deleteFireBrigadePaymentConfirmation(fireBrigadePaymentConfirId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadePaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadePaymentConfirmationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadePaymentConfirmationLocalService.dynamicQuery();
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

		return _fireBrigadePaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadePaymentConfirmationModelImpl</code>.
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

		return _fireBrigadePaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadePaymentConfirmationModelImpl</code>.
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

		return _fireBrigadePaymentConfirmationLocalService.dynamicQuery(
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

		return _fireBrigadePaymentConfirmationLocalService.dynamicQueryCount(
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

		return _fireBrigadePaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			fetchFireBrigadePaymentConfirmation(
				long fireBrigadePaymentConfirId) {

		return _fireBrigadePaymentConfirmationLocalService.
			fetchFireBrigadePaymentConfirmation(fireBrigadePaymentConfirId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadePaymentConfirmationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.
			FireBrigadePaymentConfirmation> getFBA_PC_By_FBI(String caseId) {

		return _fireBrigadePaymentConfirmationLocalService.getFBA_PC_By_FBI(
			caseId);
	}

	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
				getFireBrigadePaymentByCaseId(String caseId)
			throws com.nbp.fire.brigade.stage.service.exception.
				NoSuchFireBrigadePaymentConfirmationException {

		return _fireBrigadePaymentConfirmationLocalService.
			getFireBrigadePaymentByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade payment confirmation with the primary key.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation
	 * @throws PortalException if a fire brigade payment confirmation with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
				getFireBrigadePaymentConfirmation(
					long fireBrigadePaymentConfirId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePaymentConfirmationLocalService.
			getFireBrigadePaymentConfirmation(fireBrigadePaymentConfirId);
	}

	/**
	 * Returns a range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of fire brigade payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.
			FireBrigadePaymentConfirmation> getFireBrigadePaymentConfirmations(
				int start, int end) {

		return _fireBrigadePaymentConfirmationLocalService.
			getFireBrigadePaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of fire brigade payment confirmations.
	 *
	 * @return the number of fire brigade payment confirmations
	 */
	@Override
	public int getFireBrigadePaymentConfirmationsCount() {
		return _fireBrigadePaymentConfirmationLocalService.
			getFireBrigadePaymentConfirmationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadePaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadePaymentConfirmationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadePaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadePaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was updated
	 */
	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			updateFireBrigadePaymentConfirmation(
				com.nbp.fire.brigade.stage.service.model.
					FireBrigadePaymentConfirmation
						fireBrigadePaymentConfirmation) {

		return _fireBrigadePaymentConfirmationLocalService.
			updateFireBrigadePaymentConfirmation(
				fireBrigadePaymentConfirmation);
	}

	@Override
	public
		com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation
			updateFireBrigadePaymentConfirmation(
				String caseId, java.util.Date dateReceived, String amountDue,
				String amountReceived, String receiptNumber, String comment,
				String amountOutstanding, java.util.Date dueDate,
				String status) {

		return _fireBrigadePaymentConfirmationLocalService.
			updateFireBrigadePaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadePaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadePaymentConfirmationLocalService getWrappedService() {
		return _fireBrigadePaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadePaymentConfirmationLocalService
			fireBrigadePaymentConfirmationLocalService) {

		_fireBrigadePaymentConfirmationLocalService =
			fireBrigadePaymentConfirmationLocalService;
	}

	private FireBrigadePaymentConfirmationLocalService
		_fireBrigadePaymentConfirmationLocalService;

}