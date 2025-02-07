/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PreferredCreditorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditorLocalService
 * @generated
 */
public class PreferredCreditorLocalServiceWrapper
	implements PreferredCreditorLocalService,
			   ServiceWrapper<PreferredCreditorLocalService> {

	public PreferredCreditorLocalServiceWrapper() {
		this(null);
	}

	public PreferredCreditorLocalServiceWrapper(
		PreferredCreditorLocalService preferredCreditorLocalService) {

		_preferredCreditorLocalService = preferredCreditorLocalService;
	}

	/**
	 * Adds the preferred creditor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PreferredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preferredCreditor the preferred creditor
	 * @return the preferred creditor that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
			addPreferredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					PreferredCreditor preferredCreditor) {

		return _preferredCreditorLocalService.addPreferredCreditor(
			preferredCreditor);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _preferredCreditorLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new preferred creditor with the primary key. Does not add the preferred creditor to the database.
	 *
	 * @param preferredCreditorId the primary key for the new preferred creditor
	 * @return the new preferred creditor
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
			createPreferredCreditor(long preferredCreditorId) {

		return _preferredCreditorLocalService.createPreferredCreditor(
			preferredCreditorId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_preferredCreditorLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _preferredCreditorLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the preferred creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PreferredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor that was removed
	 * @throws PortalException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
				deletePreferredCreditor(long preferredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _preferredCreditorLocalService.deletePreferredCreditor(
			preferredCreditorId);
	}

	/**
	 * Deletes the preferred creditor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PreferredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preferredCreditor the preferred creditor
	 * @return the preferred creditor that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
			deletePreferredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					PreferredCreditor preferredCreditor) {

		return _preferredCreditorLocalService.deletePreferredCreditor(
			preferredCreditor);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _preferredCreditorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _preferredCreditorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _preferredCreditorLocalService.dynamicQuery();
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

		return _preferredCreditorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.PreferredCreditorModelImpl</code>.
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

		return _preferredCreditorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.PreferredCreditorModelImpl</code>.
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

		return _preferredCreditorLocalService.dynamicQuery(
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

		return _preferredCreditorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _preferredCreditorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
			fetchPreferredCreditor(long preferredCreditorId) {

		return _preferredCreditorLocalService.fetchPreferredCreditor(
			preferredCreditorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _preferredCreditorLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			PreferredCreditor> getCreditors(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchPreferredCreditorException {

		return _preferredCreditorLocalService.getCreditors(osiInsolvencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _preferredCreditorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _preferredCreditorLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _preferredCreditorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the preferred creditor with the primary key.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor
	 * @throws PortalException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
				getPreferredCreditor(long preferredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _preferredCreditorLocalService.getPreferredCreditor(
			preferredCreditorId);
	}

	/**
	 * Returns a range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of preferred creditors
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			PreferredCreditor> getPreferredCreditors(int start, int end) {

		return _preferredCreditorLocalService.getPreferredCreditors(start, end);
	}

	/**
	 * Returns the number of preferred creditors.
	 *
	 * @return the number of preferred creditors
	 */
	@Override
	public int getPreferredCreditorsCount() {
		return _preferredCreditorLocalService.getPreferredCreditorsCount();
	}

	/**
	 * Updates the preferred creditor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PreferredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param preferredCreditor the preferred creditor
	 * @return the preferred creditor that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor
			updatePreferredCreditor(
				com.nbp.osi.insolvency.application.form.services.model.
					PreferredCreditor preferredCreditor) {

		return _preferredCreditorLocalService.updatePreferredCreditor(
			preferredCreditor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _preferredCreditorLocalService.getBasePersistence();
	}

	@Override
	public PreferredCreditorLocalService getWrappedService() {
		return _preferredCreditorLocalService;
	}

	@Override
	public void setWrappedService(
		PreferredCreditorLocalService preferredCreditorLocalService) {

		_preferredCreditorLocalService = preferredCreditorLocalService;
	}

	private PreferredCreditorLocalService _preferredCreditorLocalService;

}