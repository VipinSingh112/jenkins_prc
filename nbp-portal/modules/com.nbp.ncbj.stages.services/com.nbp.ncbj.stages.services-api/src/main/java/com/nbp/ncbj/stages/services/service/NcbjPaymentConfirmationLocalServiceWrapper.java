/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjPaymentConfirmationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationLocalService
 * @generated
 */
public class NcbjPaymentConfirmationLocalServiceWrapper
	implements NcbjPaymentConfirmationLocalService,
			   ServiceWrapper<NcbjPaymentConfirmationLocalService> {

	public NcbjPaymentConfirmationLocalServiceWrapper() {
		this(null);
	}

	public NcbjPaymentConfirmationLocalServiceWrapper(
		NcbjPaymentConfirmationLocalService
			ncbjPaymentConfirmationLocalService) {

		_ncbjPaymentConfirmationLocalService =
			ncbjPaymentConfirmationLocalService;
	}

	/**
	 * Adds the ncbj payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		addNcbjPaymentConfirmation(
			com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
				ncbjPaymentConfirmation) {

		return _ncbjPaymentConfirmationLocalService.addNcbjPaymentConfirmation(
			ncbjPaymentConfirmation);
	}

	/**
	 * Creates a new ncbj payment confirmation with the primary key. Does not add the ncbj payment confirmation to the database.
	 *
	 * @param ncbjPaymentConfirmationId the primary key for the new ncbj payment confirmation
	 * @return the new ncbj payment confirmation
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		createNcbjPaymentConfirmation(long ncbjPaymentConfirmationId) {

		return _ncbjPaymentConfirmationLocalService.
			createNcbjPaymentConfirmation(ncbjPaymentConfirmationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPaymentConfirmationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws PortalException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
			deleteNcbjPaymentConfirmation(long ncbjPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPaymentConfirmationLocalService.
			deleteNcbjPaymentConfirmation(ncbjPaymentConfirmationId);
	}

	/**
	 * Deletes the ncbj payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		deleteNcbjPaymentConfirmation(
			com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
				ncbjPaymentConfirmation) {

		return _ncbjPaymentConfirmationLocalService.
			deleteNcbjPaymentConfirmation(ncbjPaymentConfirmation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPaymentConfirmationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjPaymentConfirmationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjPaymentConfirmationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjPaymentConfirmationLocalService.dynamicQuery();
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

		return _ncbjPaymentConfirmationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
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

		return _ncbjPaymentConfirmationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
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

		return _ncbjPaymentConfirmationLocalService.dynamicQuery(
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

		return _ncbjPaymentConfirmationLocalService.dynamicQueryCount(
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

		return _ncbjPaymentConfirmationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		fetchNcbjPaymentConfirmation(long ncbjPaymentConfirmationId) {

		return _ncbjPaymentConfirmationLocalService.
			fetchNcbjPaymentConfirmation(ncbjPaymentConfirmationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjPaymentConfirmationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjPaymentConfirmationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation>
			getNcbjPayConfBy_CI(String caseId) {

		return _ncbjPaymentConfirmationLocalService.getNcbjPayConfBy_CI(caseId);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
			getNcbjPaymentConfBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return _ncbjPaymentConfirmationLocalService.getNcbjPaymentConfBy_CI(
			caseId);
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws PortalException if a ncbj payment confirmation with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
			getNcbjPaymentConfirmation(long ncbjPaymentConfirmationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPaymentConfirmationLocalService.getNcbjPaymentConfirmation(
			ncbjPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of ncbj payment confirmations
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation>
			getNcbjPaymentConfirmations(int start, int end) {

		return _ncbjPaymentConfirmationLocalService.getNcbjPaymentConfirmations(
			start, end);
	}

	/**
	 * Returns the number of ncbj payment confirmations.
	 *
	 * @return the number of ncbj payment confirmations
	 */
	@Override
	public int getNcbjPaymentConfirmationsCount() {
		return _ncbjPaymentConfirmationLocalService.
			getNcbjPaymentConfirmationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjPaymentConfirmationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPaymentConfirmationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		updateNcbjPaymentConfirmation(
			com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
				ncbjPaymentConfirmation) {

		return _ncbjPaymentConfirmationLocalService.
			updateNcbjPaymentConfirmation(ncbjPaymentConfirmation);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation
		updateNcbjPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return _ncbjPaymentConfirmationLocalService.
			updateNcbjPaymentConfirmation(
				caseId, dateReceived, amountDue, amountReceived, receiptNumber,
				comment, amountOutstanding, dueDate, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjPaymentConfirmationLocalService.getBasePersistence();
	}

	@Override
	public NcbjPaymentConfirmationLocalService getWrappedService() {
		return _ncbjPaymentConfirmationLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjPaymentConfirmationLocalService
			ncbjPaymentConfirmationLocalService) {

		_ncbjPaymentConfirmationLocalService =
			ncbjPaymentConfirmationLocalService;
	}

	private NcbjPaymentConfirmationLocalService
		_ncbjPaymentConfirmationLocalService;

}