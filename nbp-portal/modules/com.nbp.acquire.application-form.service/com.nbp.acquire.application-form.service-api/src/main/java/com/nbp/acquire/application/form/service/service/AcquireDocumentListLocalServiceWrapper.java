/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireDocumentListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListLocalService
 * @generated
 */
public class AcquireDocumentListLocalServiceWrapper
	implements AcquireDocumentListLocalService,
			   ServiceWrapper<AcquireDocumentListLocalService> {

	public AcquireDocumentListLocalServiceWrapper() {
		this(null);
	}

	public AcquireDocumentListLocalServiceWrapper(
		AcquireDocumentListLocalService acquireDocumentListLocalService) {

		_acquireDocumentListLocalService = acquireDocumentListLocalService;
	}

	/**
	 * Adds the acquire document list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
		addAcquireDocumentList(
			com.nbp.acquire.application.form.service.model.AcquireDocumentList
				acquireDocumentList) {

		return _acquireDocumentListLocalService.addAcquireDocumentList(
			acquireDocumentList);
	}

	/**
	 * Creates a new acquire document list with the primary key. Does not add the acquire document list to the database.
	 *
	 * @param acquireDocumentListId the primary key for the new acquire document list
	 * @return the new acquire document list
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
		createAcquireDocumentList(long acquireDocumentListId) {

		return _acquireDocumentListLocalService.createAcquireDocumentList(
			acquireDocumentListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDocumentListLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire document list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
		deleteAcquireDocumentList(
			com.nbp.acquire.application.form.service.model.AcquireDocumentList
				acquireDocumentList) {

		return _acquireDocumentListLocalService.deleteAcquireDocumentList(
			acquireDocumentList);
	}

	/**
	 * Deletes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws PortalException if a acquire document list with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
			deleteAcquireDocumentList(long acquireDocumentListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDocumentListLocalService.deleteAcquireDocumentList(
			acquireDocumentListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDocumentListLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireDocumentListLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireDocumentListLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireDocumentListLocalService.dynamicQuery();
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

		return _acquireDocumentListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
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

		return _acquireDocumentListLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
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

		return _acquireDocumentListLocalService.dynamicQuery(
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

		return _acquireDocumentListLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireDocumentListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
		fetchAcquireDocumentList(long acquireDocumentListId) {

		return _acquireDocumentListLocalService.fetchAcquireDocumentList(
			acquireDocumentListId);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireDocumentList>
			getAcquireDocumentByDocType(String documentType) {

		return _acquireDocumentListLocalService.getAcquireDocumentByDocType(
			documentType);
	}

	/**
	 * Returns the acquire document list with the primary key.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws PortalException if a acquire document list with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
			getAcquireDocumentList(long acquireDocumentListId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDocumentListLocalService.getAcquireDocumentList(
			acquireDocumentListId);
	}

	/**
	 * Returns a range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of acquire document lists
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireDocumentList>
			getAcquireDocumentLists(int start, int end) {

		return _acquireDocumentListLocalService.getAcquireDocumentLists(
			start, end);
	}

	/**
	 * Returns the number of acquire document lists.
	 *
	 * @return the number of acquire document lists
	 */
	@Override
	public int getAcquireDocumentListsCount() {
		return _acquireDocumentListLocalService.getAcquireDocumentListsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireDocumentListLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireDocumentListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDocumentListLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireDocumentListLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire document list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireDocumentList the acquire document list
	 * @return the acquire document list that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireDocumentList
		updateAcquireDocumentList(
			com.nbp.acquire.application.form.service.model.AcquireDocumentList
				acquireDocumentList) {

		return _acquireDocumentListLocalService.updateAcquireDocumentList(
			acquireDocumentList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireDocumentListLocalService.getBasePersistence();
	}

	@Override
	public AcquireDocumentListLocalService getWrappedService() {
		return _acquireDocumentListLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireDocumentListLocalService acquireDocumentListLocalService) {

		_acquireDocumentListLocalService = acquireDocumentListLocalService;
	}

	private AcquireDocumentListLocalService _acquireDocumentListLocalService;

}