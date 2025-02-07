/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchOfficialUseException;
import com.nbp.osi.application.form.services.model.OfficialUse;
import com.nbp.osi.application.form.services.model.OfficialUseTable;
import com.nbp.osi.application.form.services.model.impl.OfficialUseImpl;
import com.nbp.osi.application.form.services.model.impl.OfficialUseModelImpl;
import com.nbp.osi.application.form.services.service.persistence.OfficialUsePersistence;
import com.nbp.osi.application.form.services.service.persistence.OfficialUseUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the official use service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OfficialUsePersistence.class)
public class OfficialUsePersistenceImpl
	extends BasePersistenceImpl<OfficialUse> implements OfficialUsePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OfficialUseUtil</code> to access the official use persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OfficialUseImpl.class.getName();

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
	 * Returns the official use where osiApplicationId = &#63; or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use
	 * @throws NoSuchOfficialUseException if a matching official use could not be found
	 */
	@Override
	public OfficialUse findBygetOsiById(long osiApplicationId)
		throws NoSuchOfficialUseException {

		OfficialUse officialUse = fetchBygetOsiById(osiApplicationId);

		if (officialUse == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOfficialUseException(sb.toString());
		}

		return officialUse;
	}

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	@Override
	public OfficialUse fetchBygetOsiById(long osiApplicationId) {
		return fetchBygetOsiById(osiApplicationId, true);
	}

	/**
	 * Returns the official use where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching official use, or <code>null</code> if a matching official use could not be found
	 */
	@Override
	public OfficialUse fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof OfficialUse) {
			OfficialUse officialUse = (OfficialUse)result;

			if (osiApplicationId != officialUse.getOsiApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OFFICIALUSE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				List<OfficialUse> list = query.list();

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
								finderArgs = new Object[] {osiApplicationId};
							}

							_log.warn(
								"OfficialUsePersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OfficialUse officialUse = list.get(0);

					result = officialUse;

					cacheResult(officialUse);
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
			return (OfficialUse)result;
		}
	}

	/**
	 * Removes the official use where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the official use that was removed
	 */
	@Override
	public OfficialUse removeBygetOsiById(long osiApplicationId)
		throws NoSuchOfficialUseException {

		OfficialUse officialUse = findBygetOsiById(osiApplicationId);

		return remove(officialUse);
	}

	/**
	 * Returns the number of official uses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching official uses
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OFFICIALUSE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"officialUse.osiApplicationId = ?";

	public OfficialUsePersistenceImpl() {
		setModelClass(OfficialUse.class);

		setModelImplClass(OfficialUseImpl.class);
		setModelPKClass(long.class);

		setTable(OfficialUseTable.INSTANCE);
	}

	/**
	 * Caches the official use in the entity cache if it is enabled.
	 *
	 * @param officialUse the official use
	 */
	@Override
	public void cacheResult(OfficialUse officialUse) {
		entityCache.putResult(
			OfficialUseImpl.class, officialUse.getPrimaryKey(), officialUse);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {officialUse.getOsiApplicationId()}, officialUse);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the official uses in the entity cache if it is enabled.
	 *
	 * @param officialUses the official uses
	 */
	@Override
	public void cacheResult(List<OfficialUse> officialUses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (officialUses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OfficialUse officialUse : officialUses) {
			if (entityCache.getResult(
					OfficialUseImpl.class, officialUse.getPrimaryKey()) ==
						null) {

				cacheResult(officialUse);
			}
		}
	}

	/**
	 * Clears the cache for all official uses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OfficialUseImpl.class);

		finderCache.clearCache(OfficialUseImpl.class);
	}

	/**
	 * Clears the cache for the official use.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OfficialUse officialUse) {
		entityCache.removeResult(OfficialUseImpl.class, officialUse);
	}

	@Override
	public void clearCache(List<OfficialUse> officialUses) {
		for (OfficialUse officialUse : officialUses) {
			entityCache.removeResult(OfficialUseImpl.class, officialUse);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OfficialUseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OfficialUseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OfficialUseModelImpl officialUseModelImpl) {

		Object[] args = new Object[] {
			officialUseModelImpl.getOsiApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, officialUseModelImpl);
	}

	/**
	 * Creates a new official use with the primary key. Does not add the official use to the database.
	 *
	 * @param officialUseId the primary key for the new official use
	 * @return the new official use
	 */
	@Override
	public OfficialUse create(long officialUseId) {
		OfficialUse officialUse = new OfficialUseImpl();

		officialUse.setNew(true);
		officialUse.setPrimaryKey(officialUseId);

		officialUse.setCompanyId(CompanyThreadLocal.getCompanyId());

		return officialUse;
	}

	/**
	 * Removes the official use with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use that was removed
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	@Override
	public OfficialUse remove(long officialUseId)
		throws NoSuchOfficialUseException {

		return remove((Serializable)officialUseId);
	}

	/**
	 * Removes the official use with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the official use
	 * @return the official use that was removed
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	@Override
	public OfficialUse remove(Serializable primaryKey)
		throws NoSuchOfficialUseException {

		Session session = null;

		try {
			session = openSession();

			OfficialUse officialUse = (OfficialUse)session.get(
				OfficialUseImpl.class, primaryKey);

			if (officialUse == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOfficialUseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(officialUse);
		}
		catch (NoSuchOfficialUseException noSuchEntityException) {
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
	protected OfficialUse removeImpl(OfficialUse officialUse) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(officialUse)) {
				officialUse = (OfficialUse)session.get(
					OfficialUseImpl.class, officialUse.getPrimaryKeyObj());
			}

			if (officialUse != null) {
				session.delete(officialUse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (officialUse != null) {
			clearCache(officialUse);
		}

		return officialUse;
	}

	@Override
	public OfficialUse updateImpl(OfficialUse officialUse) {
		boolean isNew = officialUse.isNew();

		if (!(officialUse instanceof OfficialUseModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(officialUse.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(officialUse);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in officialUse proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OfficialUse implementation " +
					officialUse.getClass());
		}

		OfficialUseModelImpl officialUseModelImpl =
			(OfficialUseModelImpl)officialUse;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (officialUse.getCreateDate() == null)) {
			if (serviceContext == null) {
				officialUse.setCreateDate(date);
			}
			else {
				officialUse.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!officialUseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				officialUse.setModifiedDate(date);
			}
			else {
				officialUse.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(officialUse);
			}
			else {
				officialUse = (OfficialUse)session.merge(officialUse);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OfficialUseImpl.class, officialUseModelImpl, false, true);

		cacheUniqueFindersCache(officialUseModelImpl);

		if (isNew) {
			officialUse.setNew(false);
		}

		officialUse.resetOriginalValues();

		return officialUse;
	}

	/**
	 * Returns the official use with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the official use
	 * @return the official use
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	@Override
	public OfficialUse findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOfficialUseException {

		OfficialUse officialUse = fetchByPrimaryKey(primaryKey);

		if (officialUse == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOfficialUseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return officialUse;
	}

	/**
	 * Returns the official use with the primary key or throws a <code>NoSuchOfficialUseException</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use
	 * @throws NoSuchOfficialUseException if a official use with the primary key could not be found
	 */
	@Override
	public OfficialUse findByPrimaryKey(long officialUseId)
		throws NoSuchOfficialUseException {

		return findByPrimaryKey((Serializable)officialUseId);
	}

	/**
	 * Returns the official use with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use, or <code>null</code> if a official use with the primary key could not be found
	 */
	@Override
	public OfficialUse fetchByPrimaryKey(long officialUseId) {
		return fetchByPrimaryKey((Serializable)officialUseId);
	}

	/**
	 * Returns all the official uses.
	 *
	 * @return the official uses
	 */
	@Override
	public List<OfficialUse> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @return the range of official uses
	 */
	@Override
	public List<OfficialUse> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of official uses
	 */
	@Override
	public List<OfficialUse> findAll(
		int start, int end, OrderByComparator<OfficialUse> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of official uses
	 */
	@Override
	public List<OfficialUse> findAll(
		int start, int end, OrderByComparator<OfficialUse> orderByComparator,
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

		List<OfficialUse> list = null;

		if (useFinderCache) {
			list = (List<OfficialUse>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OFFICIALUSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OFFICIALUSE;

				sql = sql.concat(OfficialUseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OfficialUse>)QueryUtil.list(
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
	 * Removes all the official uses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OfficialUse officialUse : findAll()) {
			remove(officialUse);
		}
	}

	/**
	 * Returns the number of official uses.
	 *
	 * @return the number of official uses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OFFICIALUSE);

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
		return "officialUseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OFFICIALUSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OfficialUseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the official use persistence.
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
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		OfficialUseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OfficialUseUtil.setPersistence(null);

		entityCache.removeCache(OfficialUseImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OFFICIALUSE =
		"SELECT officialUse FROM OfficialUse officialUse";

	private static final String _SQL_SELECT_OFFICIALUSE_WHERE =
		"SELECT officialUse FROM OfficialUse officialUse WHERE ";

	private static final String _SQL_COUNT_OFFICIALUSE =
		"SELECT COUNT(officialUse) FROM OfficialUse officialUse";

	private static final String _SQL_COUNT_OFFICIALUSE_WHERE =
		"SELECT COUNT(officialUse) FROM OfficialUse officialUse WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "officialUse.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OfficialUse exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OfficialUse exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OfficialUsePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}