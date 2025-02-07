/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaPersonnelFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFirstLocalService
 * @generated
 */
public class AddFdaPersonnelFirstLocalServiceWrapper
	implements AddFdaPersonnelFirstLocalService,
			   ServiceWrapper<AddFdaPersonnelFirstLocalService> {

	public AddFdaPersonnelFirstLocalServiceWrapper() {
		this(null);
	}

	public AddFdaPersonnelFirstLocalServiceWrapper(
		AddFdaPersonnelFirstLocalService addFdaPersonnelFirstLocalService) {

		_addFdaPersonnelFirstLocalService = addFdaPersonnelFirstLocalService;
	}

	/**
	 * Adds the add fda personnel first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFirst the add fda personnel first
	 * @return the add fda personnel first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
		addAddFdaPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
				addFdaPersonnelFirst) {

		return _addFdaPersonnelFirstLocalService.addAddFdaPersonnelFirst(
			addFdaPersonnelFirst);
	}

	/**
	 * Creates a new add fda personnel first with the primary key. Does not add the add fda personnel first to the database.
	 *
	 * @param addFdaPersonnelFirstId the primary key for the new add fda personnel first
	 * @return the new add fda personnel first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
		createAddFdaPersonnelFirst(long addFdaPersonnelFirstId) {

		return _addFdaPersonnelFirstLocalService.createAddFdaPersonnelFirst(
			addFdaPersonnelFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add fda personnel first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFirst the add fda personnel first
	 * @return the add fda personnel first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
		deleteAddFdaPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
				addFdaPersonnelFirst) {

		return _addFdaPersonnelFirstLocalService.deleteAddFdaPersonnelFirst(
			addFdaPersonnelFirst);
	}

	/**
	 * Deletes the add fda personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first that was removed
	 * @throws PortalException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
			deleteAddFdaPersonnelFirst(long addFdaPersonnelFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFirstLocalService.deleteAddFdaPersonnelFirst(
			addFdaPersonnelFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaPersonnelFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaPersonnelFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaPersonnelFirstLocalService.dynamicQuery();
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

		return _addFdaPersonnelFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl</code>.
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

		return _addFdaPersonnelFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl</code>.
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

		return _addFdaPersonnelFirstLocalService.dynamicQuery(
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

		return _addFdaPersonnelFirstLocalService.dynamicQueryCount(
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

		return _addFdaPersonnelFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
		fetchAddFdaPersonnelFirst(long addFdaPersonnelFirstId) {

		return _addFdaPersonnelFirstLocalService.fetchAddFdaPersonnelFirst(
			addFdaPersonnelFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaPersonnelFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda personnel first with the primary key.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first
	 * @throws PortalException if a add fda personnel first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
			getAddFdaPersonnelFirst(long addFdaPersonnelFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFirstLocalService.getAddFdaPersonnelFirst(
			addFdaPersonnelFirstId);
	}

	/**
	 * Returns a range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @return the range of add fda personnel firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst>
			getAddFdaPersonnelFirsts(int start, int end) {

		return _addFdaPersonnelFirstLocalService.getAddFdaPersonnelFirsts(
			start, end);
	}

	/**
	 * Returns the number of add fda personnel firsts.
	 *
	 * @return the number of add fda personnel firsts
	 */
	@Override
	public int getAddFdaPersonnelFirstsCount() {
		return _addFdaPersonnelFirstLocalService.
			getAddFdaPersonnelFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaPersonnelFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaPersonnelFirstLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaPersonnelFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaPersonnelFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add fda personnel first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaPersonnelFirst the add fda personnel first
	 * @return the add fda personnel first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
		updateAddFdaPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst
				addFdaPersonnelFirst) {

		return _addFdaPersonnelFirstLocalService.updateAddFdaPersonnelFirst(
			addFdaPersonnelFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaPersonnelFirstLocalService.getBasePersistence();
	}

	@Override
	public AddFdaPersonnelFirstLocalService getWrappedService() {
		return _addFdaPersonnelFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaPersonnelFirstLocalService addFdaPersonnelFirstLocalService) {

		_addFdaPersonnelFirstLocalService = addFdaPersonnelFirstLocalService;
	}

	private AddFdaPersonnelFirstLocalService _addFdaPersonnelFirstLocalService;

}