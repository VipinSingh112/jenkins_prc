/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerPersonnelFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirstLocalService
 * @generated
 */
public class AddCerPersonnelFirstLocalServiceWrapper
	implements AddCerPersonnelFirstLocalService,
			   ServiceWrapper<AddCerPersonnelFirstLocalService> {

	public AddCerPersonnelFirstLocalServiceWrapper() {
		this(null);
	}

	public AddCerPersonnelFirstLocalServiceWrapper(
		AddCerPersonnelFirstLocalService addCerPersonnelFirstLocalService) {

		_addCerPersonnelFirstLocalService = addCerPersonnelFirstLocalService;
	}

	/**
	 * Adds the add cer personnel first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 * @return the add cer personnel first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
		addAddCerPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
				addCerPersonnelFirst) {

		return _addCerPersonnelFirstLocalService.addAddCerPersonnelFirst(
			addCerPersonnelFirst);
	}

	/**
	 * Creates a new add cer personnel first with the primary key. Does not add the add cer personnel first to the database.
	 *
	 * @param addCerPersonnelFirstId the primary key for the new add cer personnel first
	 * @return the new add cer personnel first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
		createAddCerPersonnelFirst(long addCerPersonnelFirstId) {

		return _addCerPersonnelFirstLocalService.createAddCerPersonnelFirst(
			addCerPersonnelFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer personnel first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 * @return the add cer personnel first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
		deleteAddCerPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
				addCerPersonnelFirst) {

		return _addCerPersonnelFirstLocalService.deleteAddCerPersonnelFirst(
			addCerPersonnelFirst);
	}

	/**
	 * Deletes the add cer personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first that was removed
	 * @throws PortalException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
			deleteAddCerPersonnelFirst(long addCerPersonnelFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelFirstLocalService.deleteAddCerPersonnelFirst(
			addCerPersonnelFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerPersonnelFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerPersonnelFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerPersonnelFirstLocalService.dynamicQuery();
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

		return _addCerPersonnelFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstModelImpl</code>.
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

		return _addCerPersonnelFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstModelImpl</code>.
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

		return _addCerPersonnelFirstLocalService.dynamicQuery(
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

		return _addCerPersonnelFirstLocalService.dynamicQueryCount(
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

		return _addCerPersonnelFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
		fetchAddCerPersonnelFirst(long addCerPersonnelFirstId) {

		return _addCerPersonnelFirstLocalService.fetchAddCerPersonnelFirst(
			addCerPersonnelFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerPersonnelFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer personnel first with the primary key.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first
	 * @throws PortalException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
			getAddCerPersonnelFirst(long addCerPersonnelFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelFirstLocalService.getAddCerPersonnelFirst(
			addCerPersonnelFirstId);
	}

	/**
	 * Returns a range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of add cer personnel firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst>
			getAddCerPersonnelFirsts(int start, int end) {

		return _addCerPersonnelFirstLocalService.getAddCerPersonnelFirsts(
			start, end);
	}

	/**
	 * Returns the number of add cer personnel firsts.
	 *
	 * @return the number of add cer personnel firsts
	 */
	@Override
	public int getAddCerPersonnelFirstsCount() {
		return _addCerPersonnelFirstLocalService.
			getAddCerPersonnelFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerPersonnelFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerPersonnelFirstLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerPersonnelFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerPersonnelFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add cer personnel first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerPersonnelFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 * @return the add cer personnel first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
		updateAddCerPersonnelFirst(
			com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst
				addCerPersonnelFirst) {

		return _addCerPersonnelFirstLocalService.updateAddCerPersonnelFirst(
			addCerPersonnelFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerPersonnelFirstLocalService.getBasePersistence();
	}

	@Override
	public AddCerPersonnelFirstLocalService getWrappedService() {
		return _addCerPersonnelFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerPersonnelFirstLocalService addCerPersonnelFirstLocalService) {

		_addCerPersonnelFirstLocalService = addCerPersonnelFirstLocalService;
	}

	private AddCerPersonnelFirstLocalService _addCerPersonnelFirstLocalService;

}