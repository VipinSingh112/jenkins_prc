/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NotUsedSecurityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurityLocalService
 * @generated
 */
public class NotUsedSecurityLocalServiceWrapper
	implements NotUsedSecurityLocalService,
			   ServiceWrapper<NotUsedSecurityLocalService> {

	public NotUsedSecurityLocalServiceWrapper() {
		this(null);
	}

	public NotUsedSecurityLocalServiceWrapper(
		NotUsedSecurityLocalService notUsedSecurityLocalService) {

		_notUsedSecurityLocalService = notUsedSecurityLocalService;
	}

	/**
	 * Adds the not used security to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotUsedSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notUsedSecurity the not used security
	 * @return the not used security that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
			addNotUsedSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					NotUsedSecurity notUsedSecurity) {

		return _notUsedSecurityLocalService.addNotUsedSecurity(notUsedSecurity);
	}

	/**
	 * Creates a new not used security with the primary key. Does not add the not used security to the database.
	 *
	 * @param notUsedSecurityId the primary key for the new not used security
	 * @return the new not used security
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
			createNotUsedSecurity(long notUsedSecurityId) {

		return _notUsedSecurityLocalService.createNotUsedSecurity(
			notUsedSecurityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notUsedSecurityLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_notUsedSecurityLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the not used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotUsedSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security that was removed
	 * @throws PortalException if a not used security with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
				deleteNotUsedSecurity(long notUsedSecurityId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _notUsedSecurityLocalService.deleteNotUsedSecurity(
			notUsedSecurityId);
	}

	/**
	 * Deletes the not used security from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotUsedSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notUsedSecurity the not used security
	 * @return the not used security that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
			deleteNotUsedSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					NotUsedSecurity notUsedSecurity) {

		return _notUsedSecurityLocalService.deleteNotUsedSecurity(
			notUsedSecurity);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notUsedSecurityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _notUsedSecurityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _notUsedSecurityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _notUsedSecurityLocalService.dynamicQuery();
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

		return _notUsedSecurityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityModelImpl</code>.
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

		return _notUsedSecurityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityModelImpl</code>.
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

		return _notUsedSecurityLocalService.dynamicQuery(
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

		return _notUsedSecurityLocalService.dynamicQueryCount(dynamicQuery);
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

		return _notUsedSecurityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
			fetchNotUsedSecurity(long notUsedSecurityId) {

		return _notUsedSecurityLocalService.fetchNotUsedSecurity(
			notUsedSecurityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _notUsedSecurityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _notUsedSecurityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of not used securities
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity>
			getNotUsedSecurities(int start, int end) {

		return _notUsedSecurityLocalService.getNotUsedSecurities(start, end);
	}

	/**
	 * Returns the number of not used securities.
	 *
	 * @return the number of not used securities
	 */
	@Override
	public int getNotUsedSecuritiesCount() {
		return _notUsedSecurityLocalService.getNotUsedSecuritiesCount();
	}

	/**
	 * Returns the not used security with the primary key.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security
	 * @throws PortalException if a not used security with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
				getNotUsedSecurity(long notUsedSecurityId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _notUsedSecurityLocalService.getNotUsedSecurity(
			notUsedSecurityId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _notUsedSecurityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity>
				getOsiByIdList(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchNotUsedSecurityException {

		return _notUsedSecurityLocalService.getOsiByIdList(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _notUsedSecurityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the not used security in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NotUsedSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param notUsedSecurity the not used security
	 * @return the not used security that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity
			updateNotUsedSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					NotUsedSecurity notUsedSecurity) {

		return _notUsedSecurityLocalService.updateNotUsedSecurity(
			notUsedSecurity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _notUsedSecurityLocalService.getBasePersistence();
	}

	@Override
	public NotUsedSecurityLocalService getWrappedService() {
		return _notUsedSecurityLocalService;
	}

	@Override
	public void setWrappedService(
		NotUsedSecurityLocalService notUsedSecurityLocalService) {

		_notUsedSecurityLocalService = notUsedSecurityLocalService;
	}

	private NotUsedSecurityLocalService _notUsedSecurityLocalService;

}