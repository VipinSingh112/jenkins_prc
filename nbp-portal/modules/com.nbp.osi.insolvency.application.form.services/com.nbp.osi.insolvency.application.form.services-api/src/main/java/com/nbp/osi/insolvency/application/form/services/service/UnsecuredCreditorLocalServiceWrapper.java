/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link UnsecuredCreditorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditorLocalService
 * @generated
 */
public class UnsecuredCreditorLocalServiceWrapper
	implements ServiceWrapper<UnsecuredCreditorLocalService>,
			   UnsecuredCreditorLocalService {

	public UnsecuredCreditorLocalServiceWrapper() {
		this(null);
	}

	public UnsecuredCreditorLocalServiceWrapper(
		UnsecuredCreditorLocalService unsecuredCreditorLocalService) {

		_unsecuredCreditorLocalService = unsecuredCreditorLocalService;
	}

	/**
	 * Adds the unsecured creditor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 * @return the unsecured creditor that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
			addUnsecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					UnsecuredCreditor unsecuredCreditor) {

		return _unsecuredCreditorLocalService.addUnsecuredCreditor(
			unsecuredCreditor);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsecuredCreditorLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new unsecured creditor with the primary key. Does not add the unsecured creditor to the database.
	 *
	 * @param unsecuredCreditorId the primary key for the new unsecured creditor
	 * @return the new unsecured creditor
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
			createUnsecuredCreditor(long unsecuredCreditorId) {

		return _unsecuredCreditorLocalService.createUnsecuredCreditor(
			unsecuredCreditorId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_unsecuredCreditorLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsecuredCreditorLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor that was removed
	 * @throws PortalException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
				deleteUnsecuredCreditor(long unsecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _unsecuredCreditorLocalService.deleteUnsecuredCreditor(
			unsecuredCreditorId);
	}

	/**
	 * Deletes the unsecured creditor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 * @return the unsecured creditor that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
			deleteUnsecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					UnsecuredCreditor unsecuredCreditor) {

		return _unsecuredCreditorLocalService.deleteUnsecuredCreditor(
			unsecuredCreditor);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _unsecuredCreditorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _unsecuredCreditorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _unsecuredCreditorLocalService.dynamicQuery();
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

		return _unsecuredCreditorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.UnsecuredCreditorModelImpl</code>.
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

		return _unsecuredCreditorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.UnsecuredCreditorModelImpl</code>.
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

		return _unsecuredCreditorLocalService.dynamicQuery(
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

		return _unsecuredCreditorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _unsecuredCreditorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
			fetchUnsecuredCreditor(long unsecuredCreditorId) {

		return _unsecuredCreditorLocalService.fetchUnsecuredCreditor(
			unsecuredCreditorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _unsecuredCreditorLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			UnsecuredCreditor> getCreditor(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchUnsecuredCreditorException {

		return _unsecuredCreditorLocalService.getCreditor(osiInsolvencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _unsecuredCreditorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _unsecuredCreditorLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsecuredCreditorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the unsecured creditor with the primary key.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor
	 * @throws PortalException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
				getUnsecuredCreditor(long unsecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _unsecuredCreditorLocalService.getUnsecuredCreditor(
			unsecuredCreditorId);
	}

	/**
	 * Returns a range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of unsecured creditors
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			UnsecuredCreditor> getUnsecuredCreditors(int start, int end) {

		return _unsecuredCreditorLocalService.getUnsecuredCreditors(start, end);
	}

	/**
	 * Returns the number of unsecured creditors.
	 *
	 * @return the number of unsecured creditors
	 */
	@Override
	public int getUnsecuredCreditorsCount() {
		return _unsecuredCreditorLocalService.getUnsecuredCreditorsCount();
	}

	/**
	 * Updates the unsecured creditor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 * @return the unsecured creditor that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor
			updateUnsecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					UnsecuredCreditor unsecuredCreditor) {

		return _unsecuredCreditorLocalService.updateUnsecuredCreditor(
			unsecuredCreditor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _unsecuredCreditorLocalService.getBasePersistence();
	}

	@Override
	public UnsecuredCreditorLocalService getWrappedService() {
		return _unsecuredCreditorLocalService;
	}

	@Override
	public void setWrappedService(
		UnsecuredCreditorLocalService unsecuredCreditorLocalService) {

		_unsecuredCreditorLocalService = unsecuredCreditorLocalService;
	}

	private UnsecuredCreditorLocalService _unsecuredCreditorLocalService;

}