/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SubjectDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubjectDataLocalService
 * @generated
 */
public class SubjectDataLocalServiceWrapper
	implements ServiceWrapper<SubjectDataLocalService>,
			   SubjectDataLocalService {

	public SubjectDataLocalServiceWrapper() {
		this(null);
	}

	public SubjectDataLocalServiceWrapper(
		SubjectDataLocalService subjectDataLocalService) {

		_subjectDataLocalService = subjectDataLocalService;
	}

	/**
	 * Adds the subject data to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectData the subject data
	 * @return the subject data that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
		addSubjectData(
			com.nbp.osi.insolvency.application.form.services.model.SubjectData
				subjectData) {

		return _subjectDataLocalService.addSubjectData(subjectData);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectDataLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new subject data with the primary key. Does not add the subject data to the database.
	 *
	 * @param subjectDataId the primary key for the new subject data
	 * @return the new subject data
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
		createSubjectData(long subjectDataId) {

		return _subjectDataLocalService.createSubjectData(subjectDataId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectDataLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the subject data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data that was removed
	 * @throws PortalException if a subject data with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
			deleteSubjectData(long subjectDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectDataLocalService.deleteSubjectData(subjectDataId);
	}

	/**
	 * Deletes the subject data from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectData the subject data
	 * @return the subject data that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
		deleteSubjectData(
			com.nbp.osi.insolvency.application.form.services.model.SubjectData
				subjectData) {

		return _subjectDataLocalService.deleteSubjectData(subjectData);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _subjectDataLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _subjectDataLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subjectDataLocalService.dynamicQuery();
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

		return _subjectDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SubjectDataModelImpl</code>.
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

		return _subjectDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SubjectDataModelImpl</code>.
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

		return _subjectDataLocalService.dynamicQuery(
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

		return _subjectDataLocalService.dynamicQueryCount(dynamicQuery);
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

		return _subjectDataLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
		fetchSubjectData(long subjectDataId) {

		return _subjectDataLocalService.fetchSubjectData(subjectDataId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _subjectDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _subjectDataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subjectDataLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
			getOsiInsolvencyById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSubjectDataException {

		return _subjectDataLocalService.getOsiInsolvencyById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the subject data with the primary key.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data
	 * @throws PortalException if a subject data with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
			getSubjectData(long subjectDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectDataLocalService.getSubjectData(subjectDataId);
	}

	/**
	 * Returns a range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @return the range of subject datas
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.SubjectData>
			getSubjectDatas(int start, int end) {

		return _subjectDataLocalService.getSubjectDatas(start, end);
	}

	/**
	 * Returns the number of subject datas.
	 *
	 * @return the number of subject datas
	 */
	@Override
	public int getSubjectDatasCount() {
		return _subjectDataLocalService.getSubjectDatasCount();
	}

	/**
	 * Updates the subject data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectData the subject data
	 * @return the subject data that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.SubjectData
		updateSubjectData(
			com.nbp.osi.insolvency.application.form.services.model.SubjectData
				subjectData) {

		return _subjectDataLocalService.updateSubjectData(subjectData);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _subjectDataLocalService.getBasePersistence();
	}

	@Override
	public SubjectDataLocalService getWrappedService() {
		return _subjectDataLocalService;
	}

	@Override
	public void setWrappedService(
		SubjectDataLocalService subjectDataLocalService) {

		_subjectDataLocalService = subjectDataLocalService;
	}

	private SubjectDataLocalService _subjectDataLocalService;

}