/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicSafeguardMaterialAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAddLocalService
 * @generated
 */
public class MiicSafeguardMaterialAddLocalServiceWrapper
	implements MiicSafeguardMaterialAddLocalService,
			   ServiceWrapper<MiicSafeguardMaterialAddLocalService> {

	public MiicSafeguardMaterialAddLocalServiceWrapper() {
		this(null);
	}

	public MiicSafeguardMaterialAddLocalServiceWrapper(
		MiicSafeguardMaterialAddLocalService
			miicSafeguardMaterialAddLocalService) {

		_miicSafeguardMaterialAddLocalService =
			miicSafeguardMaterialAddLocalService;
	}

	/**
	 * Adds the miic safeguard material add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
		addMiicSafeguardMaterialAdd(
			com.nbp.miic.application.form.services.model.
				MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return _miicSafeguardMaterialAddLocalService.
			addMiicSafeguardMaterialAdd(miicSafeguardMaterialAdd);
	}

	/**
	 * Creates a new miic safeguard material add with the primary key. Does not add the miic safeguard material add to the database.
	 *
	 * @param miicSafeguardMaterialAddId the primary key for the new miic safeguard material add
	 * @return the new miic safeguard material add
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
		createMiicSafeguardMaterialAdd(long miicSafeguardMaterialAddId) {

		return _miicSafeguardMaterialAddLocalService.
			createMiicSafeguardMaterialAdd(miicSafeguardMaterialAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardMaterialAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic safeguard material add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
			deleteMiicSafeguardMaterialAdd(long miicSafeguardMaterialAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardMaterialAddLocalService.
			deleteMiicSafeguardMaterialAdd(miicSafeguardMaterialAddId);
	}

	/**
	 * Deletes the miic safeguard material add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
		deleteMiicSafeguardMaterialAdd(
			com.nbp.miic.application.form.services.model.
				MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return _miicSafeguardMaterialAddLocalService.
			deleteMiicSafeguardMaterialAdd(miicSafeguardMaterialAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardMaterialAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicSafeguardMaterialAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicSafeguardMaterialAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicSafeguardMaterialAddLocalService.dynamicQuery();
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

		return _miicSafeguardMaterialAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
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

		return _miicSafeguardMaterialAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
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

		return _miicSafeguardMaterialAddLocalService.dynamicQuery(
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

		return _miicSafeguardMaterialAddLocalService.dynamicQueryCount(
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

		return _miicSafeguardMaterialAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
		fetchMiicSafeguardMaterialAdd(long miicSafeguardMaterialAddId) {

		return _miicSafeguardMaterialAddLocalService.
			fetchMiicSafeguardMaterialAdd(miicSafeguardMaterialAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicSafeguardMaterialAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicSafeguardMaterialAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd>
			getMiicById(long applicationId) {

		return _miicSafeguardMaterialAddLocalService.getMiicById(applicationId);
	}

	/**
	 * Returns the miic safeguard material add with the primary key.
	 *
	 * @param miicSafeguardMaterialAddId the primary key of the miic safeguard material add
	 * @return the miic safeguard material add
	 * @throws PortalException if a miic safeguard material add with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
			getMiicSafeguardMaterialAdd(long miicSafeguardMaterialAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardMaterialAddLocalService.
			getMiicSafeguardMaterialAdd(miicSafeguardMaterialAddId);
	}

	/**
	 * Returns a range of all the miic safeguard material adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard material adds
	 * @param end the upper bound of the range of miic safeguard material adds (not inclusive)
	 * @return the range of miic safeguard material adds
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd>
			getMiicSafeguardMaterialAdds(int start, int end) {

		return _miicSafeguardMaterialAddLocalService.
			getMiicSafeguardMaterialAdds(start, end);
	}

	/**
	 * Returns the number of miic safeguard material adds.
	 *
	 * @return the number of miic safeguard material adds
	 */
	@Override
	public int getMiicSafeguardMaterialAddsCount() {
		return _miicSafeguardMaterialAddLocalService.
			getMiicSafeguardMaterialAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSafeguardMaterialAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicSafeguardMaterialAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic safeguard material add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicSafeguardMaterialAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicSafeguardMaterialAdd the miic safeguard material add
	 * @return the miic safeguard material add that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd
		updateMiicSafeguardMaterialAdd(
			com.nbp.miic.application.form.services.model.
				MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return _miicSafeguardMaterialAddLocalService.
			updateMiicSafeguardMaterialAdd(miicSafeguardMaterialAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicSafeguardMaterialAddLocalService.getBasePersistence();
	}

	@Override
	public MiicSafeguardMaterialAddLocalService getWrappedService() {
		return _miicSafeguardMaterialAddLocalService;
	}

	@Override
	public void setWrappedService(
		MiicSafeguardMaterialAddLocalService
			miicSafeguardMaterialAddLocalService) {

		_miicSafeguardMaterialAddLocalService =
			miicSafeguardMaterialAddLocalService;
	}

	private MiicSafeguardMaterialAddLocalService
		_miicSafeguardMaterialAddLocalService;

}