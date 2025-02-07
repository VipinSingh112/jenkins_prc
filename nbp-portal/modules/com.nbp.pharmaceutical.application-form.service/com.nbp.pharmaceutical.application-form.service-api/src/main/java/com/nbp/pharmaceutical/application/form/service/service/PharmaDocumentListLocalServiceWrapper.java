/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaDocumentListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentListLocalService
 * @generated
 */
public class PharmaDocumentListLocalServiceWrapper
	implements PharmaDocumentListLocalService,
			   ServiceWrapper<PharmaDocumentListLocalService> {

	public PharmaDocumentListLocalServiceWrapper() {
		this(null);
	}

	public PharmaDocumentListLocalServiceWrapper(
		PharmaDocumentListLocalService pharmaDocumentListLocalService) {

		_pharmaDocumentListLocalService = pharmaDocumentListLocalService;
	}

	/**
	 * Adds the pharma document list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDocumentList the pharma document list
	 * @return the pharma document list that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
			addPharmaDocumentList(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaDocumentList pharmaDocumentList) {

		return _pharmaDocumentListLocalService.addPharmaDocumentList(
			pharmaDocumentList);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDocumentListLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma document list with the primary key. Does not add the pharma document list to the database.
	 *
	 * @param pharmaDocListId the primary key for the new pharma document list
	 * @return the new pharma document list
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
			createPharmaDocumentList(long pharmaDocListId) {

		return _pharmaDocumentListLocalService.createPharmaDocumentList(
			pharmaDocListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDocumentListLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list that was removed
	 * @throws PortalException if a pharma document list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
				deletePharmaDocumentList(long pharmaDocListId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDocumentListLocalService.deletePharmaDocumentList(
			pharmaDocListId);
	}

	/**
	 * Deletes the pharma document list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDocumentList the pharma document list
	 * @return the pharma document list that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
			deletePharmaDocumentList(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaDocumentList pharmaDocumentList) {

		return _pharmaDocumentListLocalService.deletePharmaDocumentList(
			pharmaDocumentList);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaDocumentListLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaDocumentListLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaDocumentListLocalService.dynamicQuery();
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

		return _pharmaDocumentListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDocumentListModelImpl</code>.
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

		return _pharmaDocumentListLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDocumentListModelImpl</code>.
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

		return _pharmaDocumentListLocalService.dynamicQuery(
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

		return _pharmaDocumentListLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pharmaDocumentListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
			fetchPharmaDocumentList(long pharmaDocListId) {

		return _pharmaDocumentListLocalService.fetchPharmaDocumentList(
			pharmaDocListId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaDocumentListLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaDocumentListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDocumentListLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDocumentListLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaDocumentList> getPharmaDocListByAppId(String applicantType) {

		return _pharmaDocumentListLocalService.getPharmaDocListByAppId(
			applicantType);
	}

	/**
	 * Returns the pharma document list with the primary key.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list
	 * @throws PortalException if a pharma document list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
				getPharmaDocumentList(long pharmaDocListId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDocumentListLocalService.getPharmaDocumentList(
			pharmaDocListId);
	}

	/**
	 * Returns a range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @return the range of pharma document lists
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaDocumentList> getPharmaDocumentLists(int start, int end) {

		return _pharmaDocumentListLocalService.getPharmaDocumentLists(
			start, end);
	}

	/**
	 * Returns the number of pharma document lists.
	 *
	 * @return the number of pharma document lists
	 */
	@Override
	public int getPharmaDocumentListsCount() {
		return _pharmaDocumentListLocalService.getPharmaDocumentListsCount();
	}

	/**
	 * Updates the pharma document list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDocumentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDocumentList the pharma document list
	 * @return the pharma document list that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList
			updatePharmaDocumentList(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaDocumentList pharmaDocumentList) {

		return _pharmaDocumentListLocalService.updatePharmaDocumentList(
			pharmaDocumentList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaDocumentListLocalService.getBasePersistence();
	}

	@Override
	public PharmaDocumentListLocalService getWrappedService() {
		return _pharmaDocumentListLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaDocumentListLocalService pharmaDocumentListLocalService) {

		_pharmaDocumentListLocalService = pharmaDocumentListLocalService;
	}

	private PharmaDocumentListLocalService _pharmaDocumentListLocalService;

}