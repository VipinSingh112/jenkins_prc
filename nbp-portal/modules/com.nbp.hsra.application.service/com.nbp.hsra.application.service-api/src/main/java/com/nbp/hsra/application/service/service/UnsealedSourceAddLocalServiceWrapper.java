/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link UnsealedSourceAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAddLocalService
 * @generated
 */
public class UnsealedSourceAddLocalServiceWrapper
	implements ServiceWrapper<UnsealedSourceAddLocalService>,
			   UnsealedSourceAddLocalService {

	public UnsealedSourceAddLocalServiceWrapper() {
		this(null);
	}

	public UnsealedSourceAddLocalServiceWrapper(
		UnsealedSourceAddLocalService unsealedSourceAddLocalService) {

		_unsealedSourceAddLocalService = unsealedSourceAddLocalService;
	}

	/**
	 * Adds the unsealed source add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsealedSourceAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 * @return the unsealed source add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
		addUnsealedSourceAdd(
			com.nbp.hsra.application.service.model.UnsealedSourceAdd
				unsealedSourceAdd) {

		return _unsealedSourceAddLocalService.addUnsealedSourceAdd(
			unsealedSourceAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsealedSourceAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new unsealed source add with the primary key. Does not add the unsealed source add to the database.
	 *
	 * @param unsealedSourceAddId the primary key for the new unsealed source add
	 * @return the new unsealed source add
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
		createUnsealedSourceAdd(long unsealedSourceAddId) {

		return _unsealedSourceAddLocalService.createUnsealedSourceAdd(
			unsealedSourceAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsealedSourceAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the unsealed source add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsealedSourceAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add that was removed
	 * @throws PortalException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
			deleteUnsealedSourceAdd(long unsealedSourceAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsealedSourceAddLocalService.deleteUnsealedSourceAdd(
			unsealedSourceAddId);
	}

	/**
	 * Deletes the unsealed source add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsealedSourceAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 * @return the unsealed source add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
		deleteUnsealedSourceAdd(
			com.nbp.hsra.application.service.model.UnsealedSourceAdd
				unsealedSourceAdd) {

		return _unsealedSourceAddLocalService.deleteUnsealedSourceAdd(
			unsealedSourceAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _unsealedSourceAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _unsealedSourceAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _unsealedSourceAddLocalService.dynamicQuery();
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

		return _unsealedSourceAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.UnsealedSourceAddModelImpl</code>.
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

		return _unsealedSourceAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.UnsealedSourceAddModelImpl</code>.
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

		return _unsealedSourceAddLocalService.dynamicQuery(
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

		return _unsealedSourceAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _unsealedSourceAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
		fetchUnsealedSourceAdd(long unsealedSourceAddId) {

		return _unsealedSourceAddLocalService.fetchUnsealedSourceAdd(
			unsealedSourceAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _unsealedSourceAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.UnsealedSourceAdd> getHsraById(
			long hsraApplicationId) {

		return _unsealedSourceAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _unsealedSourceAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _unsealedSourceAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsealedSourceAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the unsealed source add with the primary key.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add
	 * @throws PortalException if a unsealed source add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
			getUnsealedSourceAdd(long unsealedSourceAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _unsealedSourceAddLocalService.getUnsealedSourceAdd(
			unsealedSourceAddId);
	}

	/**
	 * Returns a range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of unsealed source adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.UnsealedSourceAdd>
			getUnsealedSourceAdds(int start, int end) {

		return _unsealedSourceAddLocalService.getUnsealedSourceAdds(start, end);
	}

	/**
	 * Returns the number of unsealed source adds.
	 *
	 * @return the number of unsealed source adds
	 */
	@Override
	public int getUnsealedSourceAddsCount() {
		return _unsealedSourceAddLocalService.getUnsealedSourceAddsCount();
	}

	/**
	 * Updates the unsealed source add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UnsealedSourceAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 * @return the unsealed source add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.UnsealedSourceAdd
		updateUnsealedSourceAdd(
			com.nbp.hsra.application.service.model.UnsealedSourceAdd
				unsealedSourceAdd) {

		return _unsealedSourceAddLocalService.updateUnsealedSourceAdd(
			unsealedSourceAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _unsealedSourceAddLocalService.getBasePersistence();
	}

	@Override
	public UnsealedSourceAddLocalService getWrappedService() {
		return _unsealedSourceAddLocalService;
	}

	@Override
	public void setWrappedService(
		UnsealedSourceAddLocalService unsealedSourceAddLocalService) {

		_unsealedSourceAddLocalService = unsealedSourceAddLocalService;
	}

	private UnsealedSourceAddLocalService _unsealedSourceAddLocalService;

}