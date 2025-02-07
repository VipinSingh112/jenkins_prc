/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchSubjectDataException;
import com.nbp.osi.insolvency.application.form.services.model.SubjectData;
import com.nbp.osi.insolvency.application.form.services.model.SubjectDataTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.SubjectDataImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.SubjectDataModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SubjectDataPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.SubjectDataUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the subject data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SubjectDataPersistence.class)
public class SubjectDataPersistenceImpl
	extends BasePersistenceImpl<SubjectData> implements SubjectDataPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SubjectDataUtil</code> to access the subject data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SubjectDataImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or throws a <code>NoSuchSubjectDataException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching subject data
	 * @throws NoSuchSubjectDataException if a matching subject data could not be found
	 */
	@Override
	public SubjectData findBygetOsiById(long osiInsolvencyId)
		throws NoSuchSubjectDataException {

		SubjectData subjectData = fetchBygetOsiById(osiInsolvencyId);

		if (subjectData == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSubjectDataException(sb.toString());
		}

		return subjectData;
	}

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching subject data, or <code>null</code> if a matching subject data could not be found
	 */
	@Override
	public SubjectData fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject data, or <code>null</code> if a matching subject data could not be found
	 */
	@Override
	public SubjectData fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof SubjectData) {
			SubjectData subjectData = (SubjectData)result;

			if (osiInsolvencyId != subjectData.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SUBJECTDATA_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<SubjectData> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"SubjectDataPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SubjectData subjectData = list.get(0);

					result = subjectData;

					cacheResult(subjectData);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (SubjectData)result;
		}
	}

	/**
	 * Removes the subject data where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the subject data that was removed
	 */
	@Override
	public SubjectData removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchSubjectDataException {

		SubjectData subjectData = findBygetOsiById(osiInsolvencyId);

		return remove(subjectData);
	}

	/**
	 * Returns the number of subject datas where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching subject datas
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SUBJECTDATA_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"subjectData.osiInsolvencyId = ?";

	public SubjectDataPersistenceImpl() {
		setModelClass(SubjectData.class);

		setModelImplClass(SubjectDataImpl.class);
		setModelPKClass(long.class);

		setTable(SubjectDataTable.INSTANCE);
	}

	/**
	 * Caches the subject data in the entity cache if it is enabled.
	 *
	 * @param subjectData the subject data
	 */
	@Override
	public void cacheResult(SubjectData subjectData) {
		entityCache.putResult(
			SubjectDataImpl.class, subjectData.getPrimaryKey(), subjectData);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {subjectData.getOsiInsolvencyId()}, subjectData);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the subject datas in the entity cache if it is enabled.
	 *
	 * @param subjectDatas the subject datas
	 */
	@Override
	public void cacheResult(List<SubjectData> subjectDatas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (subjectDatas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SubjectData subjectData : subjectDatas) {
			if (entityCache.getResult(
					SubjectDataImpl.class, subjectData.getPrimaryKey()) ==
						null) {

				cacheResult(subjectData);
			}
		}
	}

	/**
	 * Clears the cache for all subject datas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SubjectDataImpl.class);

		finderCache.clearCache(SubjectDataImpl.class);
	}

	/**
	 * Clears the cache for the subject data.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SubjectData subjectData) {
		entityCache.removeResult(SubjectDataImpl.class, subjectData);
	}

	@Override
	public void clearCache(List<SubjectData> subjectDatas) {
		for (SubjectData subjectData : subjectDatas) {
			entityCache.removeResult(SubjectDataImpl.class, subjectData);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SubjectDataImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SubjectDataImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SubjectDataModelImpl subjectDataModelImpl) {

		Object[] args = new Object[] {
			subjectDataModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, subjectDataModelImpl);
	}

	/**
	 * Creates a new subject data with the primary key. Does not add the subject data to the database.
	 *
	 * @param subjectDataId the primary key for the new subject data
	 * @return the new subject data
	 */
	@Override
	public SubjectData create(long subjectDataId) {
		SubjectData subjectData = new SubjectDataImpl();

		subjectData.setNew(true);
		subjectData.setPrimaryKey(subjectDataId);

		subjectData.setCompanyId(CompanyThreadLocal.getCompanyId());

		return subjectData;
	}

	/**
	 * Removes the subject data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data that was removed
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	@Override
	public SubjectData remove(long subjectDataId)
		throws NoSuchSubjectDataException {

		return remove((Serializable)subjectDataId);
	}

	/**
	 * Removes the subject data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subject data
	 * @return the subject data that was removed
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	@Override
	public SubjectData remove(Serializable primaryKey)
		throws NoSuchSubjectDataException {

		Session session = null;

		try {
			session = openSession();

			SubjectData subjectData = (SubjectData)session.get(
				SubjectDataImpl.class, primaryKey);

			if (subjectData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubjectDataException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(subjectData);
		}
		catch (NoSuchSubjectDataException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected SubjectData removeImpl(SubjectData subjectData) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subjectData)) {
				subjectData = (SubjectData)session.get(
					SubjectDataImpl.class, subjectData.getPrimaryKeyObj());
			}

			if (subjectData != null) {
				session.delete(subjectData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (subjectData != null) {
			clearCache(subjectData);
		}

		return subjectData;
	}

	@Override
	public SubjectData updateImpl(SubjectData subjectData) {
		boolean isNew = subjectData.isNew();

		if (!(subjectData instanceof SubjectDataModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(subjectData.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(subjectData);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in subjectData proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SubjectData implementation " +
					subjectData.getClass());
		}

		SubjectDataModelImpl subjectDataModelImpl =
			(SubjectDataModelImpl)subjectData;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (subjectData.getCreateDate() == null)) {
			if (serviceContext == null) {
				subjectData.setCreateDate(date);
			}
			else {
				subjectData.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!subjectDataModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				subjectData.setModifiedDate(date);
			}
			else {
				subjectData.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(subjectData);
			}
			else {
				subjectData = (SubjectData)session.merge(subjectData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SubjectDataImpl.class, subjectDataModelImpl, false, true);

		cacheUniqueFindersCache(subjectDataModelImpl);

		if (isNew) {
			subjectData.setNew(false);
		}

		subjectData.resetOriginalValues();

		return subjectData;
	}

	/**
	 * Returns the subject data with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subject data
	 * @return the subject data
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	@Override
	public SubjectData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubjectDataException {

		SubjectData subjectData = fetchByPrimaryKey(primaryKey);

		if (subjectData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubjectDataException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return subjectData;
	}

	/**
	 * Returns the subject data with the primary key or throws a <code>NoSuchSubjectDataException</code> if it could not be found.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	@Override
	public SubjectData findByPrimaryKey(long subjectDataId)
		throws NoSuchSubjectDataException {

		return findByPrimaryKey((Serializable)subjectDataId);
	}

	/**
	 * Returns the subject data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data, or <code>null</code> if a subject data with the primary key could not be found
	 */
	@Override
	public SubjectData fetchByPrimaryKey(long subjectDataId) {
		return fetchByPrimaryKey((Serializable)subjectDataId);
	}

	/**
	 * Returns all the subject datas.
	 *
	 * @return the subject datas
	 */
	@Override
	public List<SubjectData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @return the range of subject datas
	 */
	@Override
	public List<SubjectData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subject datas
	 */
	@Override
	public List<SubjectData> findAll(
		int start, int end, OrderByComparator<SubjectData> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subject datas
	 */
	@Override
	public List<SubjectData> findAll(
		int start, int end, OrderByComparator<SubjectData> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<SubjectData> list = null;

		if (useFinderCache) {
			list = (List<SubjectData>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SUBJECTDATA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SUBJECTDATA;

				sql = sql.concat(SubjectDataModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SubjectData>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the subject datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SubjectData subjectData : findAll()) {
			remove(subjectData);
		}
	}

	/**
	 * Returns the number of subject datas.
	 *
	 * @return the number of subject datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SUBJECTDATA);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "subjectDataId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SUBJECTDATA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SubjectDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the subject data persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		SubjectDataUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SubjectDataUtil.setPersistence(null);

		entityCache.removeCache(SubjectDataImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SUBJECTDATA =
		"SELECT subjectData FROM SubjectData subjectData";

	private static final String _SQL_SELECT_SUBJECTDATA_WHERE =
		"SELECT subjectData FROM SubjectData subjectData WHERE ";

	private static final String _SQL_COUNT_SUBJECTDATA =
		"SELECT COUNT(subjectData) FROM SubjectData subjectData";

	private static final String _SQL_COUNT_SUBJECTDATA_WHERE =
		"SELECT COUNT(subjectData) FROM SubjectData subjectData WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "subjectData.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SubjectData exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SubjectData exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SubjectDataPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}