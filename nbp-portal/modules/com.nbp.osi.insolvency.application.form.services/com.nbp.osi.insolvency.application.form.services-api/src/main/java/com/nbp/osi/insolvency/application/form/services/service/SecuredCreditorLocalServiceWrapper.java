/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SecuredCreditorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditorLocalService
 * @generated
 */
public class SecuredCreditorLocalServiceWrapper
	implements SecuredCreditorLocalService,
			   ServiceWrapper<SecuredCreditorLocalService> {

	public SecuredCreditorLocalServiceWrapper() {
		this(null);
	}

	public SecuredCreditorLocalServiceWrapper(
		SecuredCreditorLocalService securedCreditorLocalService) {

		_securedCreditorLocalService = securedCreditorLocalService;
	}

	/**
	 * Adds the secured creditor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param securedCreditor the secured creditor
	 * @return the secured creditor that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
			addSecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					SecuredCreditor securedCreditor) {

		return _securedCreditorLocalService.addSecuredCreditor(securedCreditor);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _securedCreditorLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new secured creditor with the primary key. Does not add the secured creditor to the database.
	 *
	 * @param securedCreditorId the primary key for the new secured creditor
	 * @return the new secured creditor
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
			createSecuredCreditor(long securedCreditorId) {

		return _securedCreditorLocalService.createSecuredCreditor(
			securedCreditorId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_securedCreditorLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _securedCreditorLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor that was removed
	 * @throws PortalException if a secured creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
				deleteSecuredCreditor(long securedCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _securedCreditorLocalService.deleteSecuredCreditor(
			securedCreditorId);
	}

	/**
	 * Deletes the secured creditor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param securedCreditor the secured creditor
	 * @return the secured creditor that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
			deleteSecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					SecuredCreditor securedCreditor) {

		return _securedCreditorLocalService.deleteSecuredCreditor(
			securedCreditor);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _securedCreditorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _securedCreditorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _securedCreditorLocalService.dynamicQuery();
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

		return _securedCreditorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SecuredCreditorModelImpl</code>.
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

		return _securedCreditorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SecuredCreditorModelImpl</code>.
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

		return _securedCreditorLocalService.dynamicQuery(
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

		return _securedCreditorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _securedCreditorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
			fetchSecuredCreditor(long securedCreditorId) {

		return _securedCreditorLocalService.fetchSecuredCreditor(
			securedCreditorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _securedCreditorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _securedCreditorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _securedCreditorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor>
				getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchSecuredCreditorException {

		return _securedCreditorLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _securedCreditorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the secured creditor with the primary key.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor
	 * @throws PortalException if a secured creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
				getSecuredCreditor(long securedCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _securedCreditorLocalService.getSecuredCreditor(
			securedCreditorId);
	}

	/**
	 * Returns a range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of secured creditors
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor>
			getSecuredCreditors(int start, int end) {

		return _securedCreditorLocalService.getSecuredCreditors(start, end);
	}

	/**
	 * Returns the number of secured creditors.
	 *
	 * @return the number of secured creditors
	 */
	@Override
	public int getSecuredCreditorsCount() {
		return _securedCreditorLocalService.getSecuredCreditorsCount();
	}

	/**
	 * Updates the secured creditor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param securedCreditor the secured creditor
	 * @return the secured creditor that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor
			updateSecuredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					SecuredCreditor securedCreditor) {

		return _securedCreditorLocalService.updateSecuredCreditor(
			securedCreditor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _securedCreditorLocalService.getBasePersistence();
	}

	@Override
	public SecuredCreditorLocalService getWrappedService() {
		return _securedCreditorLocalService;
	}

	@Override
	public void setWrappedService(
		SecuredCreditorLocalService securedCreditorLocalService) {

		_securedCreditorLocalService = securedCreditorLocalService;
	}

	private SecuredCreditorLocalService _securedCreditorLocalService;

}