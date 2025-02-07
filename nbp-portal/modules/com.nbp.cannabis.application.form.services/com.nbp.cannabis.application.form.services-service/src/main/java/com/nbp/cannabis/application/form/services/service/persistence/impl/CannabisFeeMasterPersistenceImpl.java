/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisFeeMasterException;
import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;
import com.nbp.cannabis.application.form.services.model.CannabisFeeMasterTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisFeeMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisFeeMasterUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the cannabis fee master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisFeeMasterPersistence.class)
public class CannabisFeeMasterPersistenceImpl
	extends BasePersistenceImpl<CannabisFeeMaster>
	implements CannabisFeeMasterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisFeeMasterUtil</code> to access the cannabis fee master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisFeeMasterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFee_by_CS;
	private FinderPath _finderPathCountBygetFee_by_CS;

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a matching cannabis fee master could not be found
	 */
	@Override
	public CannabisFeeMaster findBygetFee_by_CS(
			String category, String subCategory)
		throws NoSuchCannabisFeeMasterException {

		CannabisFeeMaster cannabisFeeMaster = fetchBygetFee_by_CS(
			category, subCategory);

		if (cannabisFeeMaster == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("category=");
			sb.append(category);

			sb.append(", subCategory=");
			sb.append(subCategory);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisFeeMasterException(sb.toString());
		}

		return cannabisFeeMaster;
	}

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	@Override
	public CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory) {

		return fetchBygetFee_by_CS(category, subCategory, true);
	}

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	@Override
	public CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory, boolean useFinderCache) {

		category = Objects.toString(category, "");
		subCategory = Objects.toString(subCategory, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {category, subCategory};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFee_by_CS, finderArgs, this);
		}

		if (result instanceof CannabisFeeMaster) {
			CannabisFeeMaster cannabisFeeMaster = (CannabisFeeMaster)result;

			if (!Objects.equals(category, cannabisFeeMaster.getCategory()) ||
				!Objects.equals(
					subCategory, cannabisFeeMaster.getSubCategory())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISFEEMASTER_WHERE);

			boolean bindCategory = false;

			if (category.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_3);
			}
			else {
				bindCategory = true;

				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_2);
			}

			boolean bindSubCategory = false;

			if (subCategory.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_3);
			}
			else {
				bindSubCategory = true;

				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCategory) {
					queryPos.add(category);
				}

				if (bindSubCategory) {
					queryPos.add(subCategory);
				}

				List<CannabisFeeMaster> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFee_by_CS, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									category, subCategory
								};
							}

							_log.warn(
								"CannabisFeeMasterPersistenceImpl.fetchBygetFee_by_CS(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisFeeMaster cannabisFeeMaster = list.get(0);

					result = cannabisFeeMaster;

					cacheResult(cannabisFeeMaster);
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
			return (CannabisFeeMaster)result;
		}
	}

	/**
	 * Removes the cannabis fee master where category = &#63; and subCategory = &#63; from the database.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the cannabis fee master that was removed
	 */
	@Override
	public CannabisFeeMaster removeBygetFee_by_CS(
			String category, String subCategory)
		throws NoSuchCannabisFeeMasterException {

		CannabisFeeMaster cannabisFeeMaster = findBygetFee_by_CS(
			category, subCategory);

		return remove(cannabisFeeMaster);
	}

	/**
	 * Returns the number of cannabis fee masters where category = &#63; and subCategory = &#63;.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the number of matching cannabis fee masters
	 */
	@Override
	public int countBygetFee_by_CS(String category, String subCategory) {
		category = Objects.toString(category, "");
		subCategory = Objects.toString(subCategory, "");

		FinderPath finderPath = _finderPathCountBygetFee_by_CS;

		Object[] finderArgs = new Object[] {category, subCategory};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISFEEMASTER_WHERE);

			boolean bindCategory = false;

			if (category.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_3);
			}
			else {
				bindCategory = true;

				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_2);
			}

			boolean bindSubCategory = false;

			if (subCategory.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_3);
			}
			else {
				bindSubCategory = true;

				sb.append(_FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCategory) {
					queryPos.add(category);
				}

				if (bindSubCategory) {
					queryPos.add(subCategory);
				}

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

	private static final String _FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_2 =
		"cannabisFeeMaster.category = ? AND ";

	private static final String _FINDER_COLUMN_GETFEE_BY_CS_CATEGORY_3 =
		"(cannabisFeeMaster.category IS NULL OR cannabisFeeMaster.category = '') AND ";

	private static final String _FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_2 =
		"cannabisFeeMaster.subCategory = ?";

	private static final String _FINDER_COLUMN_GETFEE_BY_CS_SUBCATEGORY_3 =
		"(cannabisFeeMaster.subCategory IS NULL OR cannabisFeeMaster.subCategory = '')";

	public CannabisFeeMasterPersistenceImpl() {
		setModelClass(CannabisFeeMaster.class);

		setModelImplClass(CannabisFeeMasterImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisFeeMasterTable.INSTANCE);
	}

	/**
	 * Caches the cannabis fee master in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 */
	@Override
	public void cacheResult(CannabisFeeMaster cannabisFeeMaster) {
		entityCache.putResult(
			CannabisFeeMasterImpl.class, cannabisFeeMaster.getPrimaryKey(),
			cannabisFeeMaster);

		finderCache.putResult(
			_finderPathFetchBygetFee_by_CS,
			new Object[] {
				cannabisFeeMaster.getCategory(),
				cannabisFeeMaster.getSubCategory()
			},
			cannabisFeeMaster);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis fee masters in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMasters the cannabis fee masters
	 */
	@Override
	public void cacheResult(List<CannabisFeeMaster> cannabisFeeMasters) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisFeeMasters.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisFeeMaster cannabisFeeMaster : cannabisFeeMasters) {
			if (entityCache.getResult(
					CannabisFeeMasterImpl.class,
					cannabisFeeMaster.getPrimaryKey()) == null) {

				cacheResult(cannabisFeeMaster);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis fee masters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisFeeMasterImpl.class);

		finderCache.clearCache(CannabisFeeMasterImpl.class);
	}

	/**
	 * Clears the cache for the cannabis fee master.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisFeeMaster cannabisFeeMaster) {
		entityCache.removeResult(
			CannabisFeeMasterImpl.class, cannabisFeeMaster);
	}

	@Override
	public void clearCache(List<CannabisFeeMaster> cannabisFeeMasters) {
		for (CannabisFeeMaster cannabisFeeMaster : cannabisFeeMasters) {
			entityCache.removeResult(
				CannabisFeeMasterImpl.class, cannabisFeeMaster);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisFeeMasterImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CannabisFeeMasterImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisFeeMasterModelImpl cannabisFeeMasterModelImpl) {

		Object[] args = new Object[] {
			cannabisFeeMasterModelImpl.getCategory(),
			cannabisFeeMasterModelImpl.getSubCategory()
		};

		finderCache.putResult(
			_finderPathCountBygetFee_by_CS, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFee_by_CS, args, cannabisFeeMasterModelImpl);
	}

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	@Override
	public CannabisFeeMaster create(long cannabisFeeMasterId) {
		CannabisFeeMaster cannabisFeeMaster = new CannabisFeeMasterImpl();

		cannabisFeeMaster.setNew(true);
		cannabisFeeMaster.setPrimaryKey(cannabisFeeMasterId);

		return cannabisFeeMaster;
	}

	/**
	 * Removes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster remove(long cannabisFeeMasterId)
		throws NoSuchCannabisFeeMasterException {

		return remove((Serializable)cannabisFeeMasterId);
	}

	/**
	 * Removes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster remove(Serializable primaryKey)
		throws NoSuchCannabisFeeMasterException {

		Session session = null;

		try {
			session = openSession();

			CannabisFeeMaster cannabisFeeMaster =
				(CannabisFeeMaster)session.get(
					CannabisFeeMasterImpl.class, primaryKey);

			if (cannabisFeeMaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisFeeMasterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisFeeMaster);
		}
		catch (NoSuchCannabisFeeMasterException noSuchEntityException) {
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
	protected CannabisFeeMaster removeImpl(
		CannabisFeeMaster cannabisFeeMaster) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisFeeMaster)) {
				cannabisFeeMaster = (CannabisFeeMaster)session.get(
					CannabisFeeMasterImpl.class,
					cannabisFeeMaster.getPrimaryKeyObj());
			}

			if (cannabisFeeMaster != null) {
				session.delete(cannabisFeeMaster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisFeeMaster != null) {
			clearCache(cannabisFeeMaster);
		}

		return cannabisFeeMaster;
	}

	@Override
	public CannabisFeeMaster updateImpl(CannabisFeeMaster cannabisFeeMaster) {
		boolean isNew = cannabisFeeMaster.isNew();

		if (!(cannabisFeeMaster instanceof CannabisFeeMasterModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisFeeMaster.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisFeeMaster);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisFeeMaster proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisFeeMaster implementation " +
					cannabisFeeMaster.getClass());
		}

		CannabisFeeMasterModelImpl cannabisFeeMasterModelImpl =
			(CannabisFeeMasterModelImpl)cannabisFeeMaster;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisFeeMaster);
			}
			else {
				cannabisFeeMaster = (CannabisFeeMaster)session.merge(
					cannabisFeeMaster);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisFeeMasterImpl.class, cannabisFeeMasterModelImpl, false,
			true);

		cacheUniqueFindersCache(cannabisFeeMasterModelImpl);

		if (isNew) {
			cannabisFeeMaster.setNew(false);
		}

		cannabisFeeMaster.resetOriginalValues();

		return cannabisFeeMaster;
	}

	/**
	 * Returns the cannabis fee master with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisFeeMasterException {

		CannabisFeeMaster cannabisFeeMaster = fetchByPrimaryKey(primaryKey);

		if (cannabisFeeMaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisFeeMasterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisFeeMaster;
	}

	/**
	 * Returns the cannabis fee master with the primary key or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster findByPrimaryKey(long cannabisFeeMasterId)
		throws NoSuchCannabisFeeMasterException {

		return findByPrimaryKey((Serializable)cannabisFeeMasterId);
	}

	/**
	 * Returns the cannabis fee master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master, or <code>null</code> if a cannabis fee master with the primary key could not be found
	 */
	@Override
	public CannabisFeeMaster fetchByPrimaryKey(long cannabisFeeMasterId) {
		return fetchByPrimaryKey((Serializable)cannabisFeeMasterId);
	}

	/**
	 * Returns all the cannabis fee masters.
	 *
	 * @return the cannabis fee masters
	 */
	@Override
	public List<CannabisFeeMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	@Override
	public List<CannabisFeeMaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis fee masters
	 */
	@Override
	public List<CannabisFeeMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisFeeMaster> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis fee masters
	 */
	@Override
	public List<CannabisFeeMaster> findAll(
		int start, int end,
		OrderByComparator<CannabisFeeMaster> orderByComparator,
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

		List<CannabisFeeMaster> list = null;

		if (useFinderCache) {
			list = (List<CannabisFeeMaster>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISFEEMASTER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISFEEMASTER;

				sql = sql.concat(CannabisFeeMasterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisFeeMaster>)QueryUtil.list(
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
	 * Removes all the cannabis fee masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisFeeMaster cannabisFeeMaster : findAll()) {
			remove(cannabisFeeMaster);
		}
	}

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CANNABISFEEMASTER);

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
		return "cannabisFeeMasterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISFEEMASTER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisFeeMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis fee master persistence.
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

		_finderPathFetchBygetFee_by_CS = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFee_by_CS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"category", "subCategory"}, true);

		_finderPathCountBygetFee_by_CS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFee_by_CS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"category", "subCategory"}, false);

		CannabisFeeMasterUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisFeeMasterUtil.setPersistence(null);

		entityCache.removeCache(CannabisFeeMasterImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISFEEMASTER =
		"SELECT cannabisFeeMaster FROM CannabisFeeMaster cannabisFeeMaster";

	private static final String _SQL_SELECT_CANNABISFEEMASTER_WHERE =
		"SELECT cannabisFeeMaster FROM CannabisFeeMaster cannabisFeeMaster WHERE ";

	private static final String _SQL_COUNT_CANNABISFEEMASTER =
		"SELECT COUNT(cannabisFeeMaster) FROM CannabisFeeMaster cannabisFeeMaster";

	private static final String _SQL_COUNT_CANNABISFEEMASTER_WHERE =
		"SELECT COUNT(cannabisFeeMaster) FROM CannabisFeeMaster cannabisFeeMaster WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cannabisFeeMaster.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisFeeMaster exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisFeeMaster exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisFeeMasterPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}