/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence.impl;

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

import com.nbp.ogt.application.form.services.exception.NoSuchOgtSectionBException;
import com.nbp.ogt.application.form.services.model.OgtSectionB;
import com.nbp.ogt.application.form.services.model.OgtSectionBTable;
import com.nbp.ogt.application.form.services.model.impl.OgtSectionBImpl;
import com.nbp.ogt.application.form.services.model.impl.OgtSectionBModelImpl;
import com.nbp.ogt.application.form.services.service.persistence.OgtSectionBPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtSectionBUtil;
import com.nbp.ogt.application.form.services.service.persistence.impl.constants.OGT_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ogt section b service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OgtSectionBPersistence.class)
public class OgtSectionBPersistenceImpl
	extends BasePersistenceImpl<OgtSectionB> implements OgtSectionBPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OgtSectionBUtil</code> to access the ogt section b persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OgtSectionBImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOgtById;
	private FinderPath _finderPathCountBygetOgtById;

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b
	 * @throws NoSuchOgtSectionBException if a matching ogt section b could not be found
	 */
	@Override
	public OgtSectionB findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtSectionBException {

		OgtSectionB ogtSectionB = fetchBygetOgtById(ogtApplicationId);

		if (ogtSectionB == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ogtApplicationId=");
			sb.append(ogtApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOgtSectionBException(sb.toString());
		}

		return ogtSectionB;
	}

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	@Override
	public OgtSectionB fetchBygetOgtById(long ogtApplicationId) {
		return fetchBygetOgtById(ogtApplicationId, true);
	}

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	@Override
	public OgtSectionB fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ogtApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOgtById, finderArgs, this);
		}

		if (result instanceof OgtSectionB) {
			OgtSectionB ogtSectionB = (OgtSectionB)result;

			if (ogtApplicationId != ogtSectionB.getOgtApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OGTSECTIONB_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

				List<OgtSectionB> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOgtById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ogtApplicationId};
							}

							_log.warn(
								"OgtSectionBPersistenceImpl.fetchBygetOgtById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OgtSectionB ogtSectionB = list.get(0);

					result = ogtSectionB;

					cacheResult(ogtSectionB);
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
			return (OgtSectionB)result;
		}
	}

	/**
	 * Removes the ogt section b where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt section b that was removed
	 */
	@Override
	public OgtSectionB removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtSectionBException {

		OgtSectionB ogtSectionB = findBygetOgtById(ogtApplicationId);

		return remove(ogtSectionB);
	}

	/**
	 * Returns the number of ogt section bs where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt section bs
	 */
	@Override
	public int countBygetOgtById(long ogtApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOgtById;

		Object[] finderArgs = new Object[] {ogtApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OGTSECTIONB_WHERE);

			sb.append(_FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ogtApplicationId);

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

	private static final String _FINDER_COLUMN_GETOGTBYID_OGTAPPLICATIONID_2 =
		"ogtSectionB.ogtApplicationId = ?";

	public OgtSectionBPersistenceImpl() {
		setModelClass(OgtSectionB.class);

		setModelImplClass(OgtSectionBImpl.class);
		setModelPKClass(long.class);

		setTable(OgtSectionBTable.INSTANCE);
	}

	/**
	 * Caches the ogt section b in the entity cache if it is enabled.
	 *
	 * @param ogtSectionB the ogt section b
	 */
	@Override
	public void cacheResult(OgtSectionB ogtSectionB) {
		entityCache.putResult(
			OgtSectionBImpl.class, ogtSectionB.getPrimaryKey(), ogtSectionB);

		finderCache.putResult(
			_finderPathFetchBygetOgtById,
			new Object[] {ogtSectionB.getOgtApplicationId()}, ogtSectionB);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ogt section bs in the entity cache if it is enabled.
	 *
	 * @param ogtSectionBs the ogt section bs
	 */
	@Override
	public void cacheResult(List<OgtSectionB> ogtSectionBs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ogtSectionBs.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OgtSectionB ogtSectionB : ogtSectionBs) {
			if (entityCache.getResult(
					OgtSectionBImpl.class, ogtSectionB.getPrimaryKey()) ==
						null) {

				cacheResult(ogtSectionB);
			}
		}
	}

	/**
	 * Clears the cache for all ogt section bs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OgtSectionBImpl.class);

		finderCache.clearCache(OgtSectionBImpl.class);
	}

	/**
	 * Clears the cache for the ogt section b.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OgtSectionB ogtSectionB) {
		entityCache.removeResult(OgtSectionBImpl.class, ogtSectionB);
	}

	@Override
	public void clearCache(List<OgtSectionB> ogtSectionBs) {
		for (OgtSectionB ogtSectionB : ogtSectionBs) {
			entityCache.removeResult(OgtSectionBImpl.class, ogtSectionB);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OgtSectionBImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OgtSectionBImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OgtSectionBModelImpl ogtSectionBModelImpl) {

		Object[] args = new Object[] {
			ogtSectionBModelImpl.getOgtApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOgtById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOgtById, args, ogtSectionBModelImpl);
	}

	/**
	 * Creates a new ogt section b with the primary key. Does not add the ogt section b to the database.
	 *
	 * @param ogtSectionBId the primary key for the new ogt section b
	 * @return the new ogt section b
	 */
	@Override
	public OgtSectionB create(long ogtSectionBId) {
		OgtSectionB ogtSectionB = new OgtSectionBImpl();

		ogtSectionB.setNew(true);
		ogtSectionB.setPrimaryKey(ogtSectionBId);

		ogtSectionB.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ogtSectionB;
	}

	/**
	 * Removes the ogt section b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b that was removed
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	@Override
	public OgtSectionB remove(long ogtSectionBId)
		throws NoSuchOgtSectionBException {

		return remove((Serializable)ogtSectionBId);
	}

	/**
	 * Removes the ogt section b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ogt section b
	 * @return the ogt section b that was removed
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	@Override
	public OgtSectionB remove(Serializable primaryKey)
		throws NoSuchOgtSectionBException {

		Session session = null;

		try {
			session = openSession();

			OgtSectionB ogtSectionB = (OgtSectionB)session.get(
				OgtSectionBImpl.class, primaryKey);

			if (ogtSectionB == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOgtSectionBException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ogtSectionB);
		}
		catch (NoSuchOgtSectionBException noSuchEntityException) {
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
	protected OgtSectionB removeImpl(OgtSectionB ogtSectionB) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ogtSectionB)) {
				ogtSectionB = (OgtSectionB)session.get(
					OgtSectionBImpl.class, ogtSectionB.getPrimaryKeyObj());
			}

			if (ogtSectionB != null) {
				session.delete(ogtSectionB);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ogtSectionB != null) {
			clearCache(ogtSectionB);
		}

		return ogtSectionB;
	}

	@Override
	public OgtSectionB updateImpl(OgtSectionB ogtSectionB) {
		boolean isNew = ogtSectionB.isNew();

		if (!(ogtSectionB instanceof OgtSectionBModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ogtSectionB.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(ogtSectionB);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ogtSectionB proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OgtSectionB implementation " +
					ogtSectionB.getClass());
		}

		OgtSectionBModelImpl ogtSectionBModelImpl =
			(OgtSectionBModelImpl)ogtSectionB;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ogtSectionB.getCreateDate() == null)) {
			if (serviceContext == null) {
				ogtSectionB.setCreateDate(date);
			}
			else {
				ogtSectionB.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!ogtSectionBModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ogtSectionB.setModifiedDate(date);
			}
			else {
				ogtSectionB.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ogtSectionB);
			}
			else {
				ogtSectionB = (OgtSectionB)session.merge(ogtSectionB);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OgtSectionBImpl.class, ogtSectionBModelImpl, false, true);

		cacheUniqueFindersCache(ogtSectionBModelImpl);

		if (isNew) {
			ogtSectionB.setNew(false);
		}

		ogtSectionB.resetOriginalValues();

		return ogtSectionB;
	}

	/**
	 * Returns the ogt section b with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ogt section b
	 * @return the ogt section b
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	@Override
	public OgtSectionB findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOgtSectionBException {

		OgtSectionB ogtSectionB = fetchByPrimaryKey(primaryKey);

		if (ogtSectionB == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOgtSectionBException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ogtSectionB;
	}

	/**
	 * Returns the ogt section b with the primary key or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	@Override
	public OgtSectionB findByPrimaryKey(long ogtSectionBId)
		throws NoSuchOgtSectionBException {

		return findByPrimaryKey((Serializable)ogtSectionBId);
	}

	/**
	 * Returns the ogt section b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b, or <code>null</code> if a ogt section b with the primary key could not be found
	 */
	@Override
	public OgtSectionB fetchByPrimaryKey(long ogtSectionBId) {
		return fetchByPrimaryKey((Serializable)ogtSectionBId);
	}

	/**
	 * Returns all the ogt section bs.
	 *
	 * @return the ogt section bs
	 */
	@Override
	public List<OgtSectionB> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @return the range of ogt section bs
	 */
	@Override
	public List<OgtSectionB> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt section bs
	 */
	@Override
	public List<OgtSectionB> findAll(
		int start, int end, OrderByComparator<OgtSectionB> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt section bs
	 */
	@Override
	public List<OgtSectionB> findAll(
		int start, int end, OrderByComparator<OgtSectionB> orderByComparator,
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

		List<OgtSectionB> list = null;

		if (useFinderCache) {
			list = (List<OgtSectionB>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OGTSECTIONB);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OGTSECTIONB;

				sql = sql.concat(OgtSectionBModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OgtSectionB>)QueryUtil.list(
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
	 * Removes all the ogt section bs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OgtSectionB ogtSectionB : findAll()) {
			remove(ogtSectionB);
		}
	}

	/**
	 * Returns the number of ogt section bs.
	 *
	 * @return the number of ogt section bs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OGTSECTIONB);

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
		return "ogtSectionBId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OGTSECTIONB;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OgtSectionBModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ogt section b persistence.
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

		_finderPathFetchBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, true);

		_finderPathCountBygetOgtById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOgtById",
			new String[] {Long.class.getName()},
			new String[] {"ogtApplicationId"}, false);

		OgtSectionBUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OgtSectionBUtil.setPersistence(null);

		entityCache.removeCache(OgtSectionBImpl.class.getName());
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OGT_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OGTSECTIONB =
		"SELECT ogtSectionB FROM OgtSectionB ogtSectionB";

	private static final String _SQL_SELECT_OGTSECTIONB_WHERE =
		"SELECT ogtSectionB FROM OgtSectionB ogtSectionB WHERE ";

	private static final String _SQL_COUNT_OGTSECTIONB =
		"SELECT COUNT(ogtSectionB) FROM OgtSectionB ogtSectionB";

	private static final String _SQL_COUNT_OGTSECTIONB_WHERE =
		"SELECT COUNT(ogtSectionB) FROM OgtSectionB ogtSectionB WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ogtSectionB.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OgtSectionB exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OgtSectionB exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OgtSectionBPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}