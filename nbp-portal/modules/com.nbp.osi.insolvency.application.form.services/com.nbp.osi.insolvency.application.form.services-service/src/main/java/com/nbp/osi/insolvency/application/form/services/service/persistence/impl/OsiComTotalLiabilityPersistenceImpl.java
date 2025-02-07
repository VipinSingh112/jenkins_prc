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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiComTotalLiabilityException;
import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;
import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiabilityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiComTotalLiabilityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComTotalLiabilityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComTotalLiabilityUtil;
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
 * The persistence implementation for the osi com total liability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiComTotalLiabilityPersistence.class)
public class OsiComTotalLiabilityPersistenceImpl
	extends BasePersistenceImpl<OsiComTotalLiability>
	implements OsiComTotalLiabilityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiComTotalLiabilityUtil</code> to access the osi com total liability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiComTotalLiabilityImpl.class.getName();

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
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a matching osi com total liability could not be found
	 */
	@Override
	public OsiComTotalLiability findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComTotalLiabilityException {

		OsiComTotalLiability osiComTotalLiability = fetchBygetOsiById(
			osiInsolvencyId);

		if (osiComTotalLiability == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiComTotalLiabilityException(sb.toString());
		}

		return osiComTotalLiability;
	}

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	@Override
	public OsiComTotalLiability fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi com total liability where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com total liability, or <code>null</code> if a matching osi com total liability could not be found
	 */
	@Override
	public OsiComTotalLiability fetchBygetOsiById(
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

		if (result instanceof OsiComTotalLiability) {
			OsiComTotalLiability osiComTotalLiability =
				(OsiComTotalLiability)result;

			if (osiInsolvencyId != osiComTotalLiability.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSICOMTOTALLIABILITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiComTotalLiability> list = query.list();

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
								"OsiComTotalLiabilityPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiComTotalLiability osiComTotalLiability = list.get(0);

					result = osiComTotalLiability;

					cacheResult(osiComTotalLiability);
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
			return (OsiComTotalLiability)result;
		}
	}

	/**
	 * Removes the osi com total liability where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com total liability that was removed
	 */
	@Override
	public OsiComTotalLiability removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComTotalLiabilityException {

		OsiComTotalLiability osiComTotalLiability = findBygetOsiById(
			osiInsolvencyId);

		return remove(osiComTotalLiability);
	}

	/**
	 * Returns the number of osi com total liabilities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com total liabilities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSICOMTOTALLIABILITY_WHERE);

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
		"osiComTotalLiability.osiInsolvencyId = ?";

	public OsiComTotalLiabilityPersistenceImpl() {
		setModelClass(OsiComTotalLiability.class);

		setModelImplClass(OsiComTotalLiabilityImpl.class);
		setModelPKClass(long.class);

		setTable(OsiComTotalLiabilityTable.INSTANCE);
	}

	/**
	 * Caches the osi com total liability in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiability the osi com total liability
	 */
	@Override
	public void cacheResult(OsiComTotalLiability osiComTotalLiability) {
		entityCache.putResult(
			OsiComTotalLiabilityImpl.class,
			osiComTotalLiability.getPrimaryKey(), osiComTotalLiability);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiComTotalLiability.getOsiInsolvencyId()},
			osiComTotalLiability);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi com total liabilities in the entity cache if it is enabled.
	 *
	 * @param osiComTotalLiabilities the osi com total liabilities
	 */
	@Override
	public void cacheResult(List<OsiComTotalLiability> osiComTotalLiabilities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiComTotalLiabilities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiComTotalLiability osiComTotalLiability :
				osiComTotalLiabilities) {

			if (entityCache.getResult(
					OsiComTotalLiabilityImpl.class,
					osiComTotalLiability.getPrimaryKey()) == null) {

				cacheResult(osiComTotalLiability);
			}
		}
	}

	/**
	 * Clears the cache for all osi com total liabilities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiComTotalLiabilityImpl.class);

		finderCache.clearCache(OsiComTotalLiabilityImpl.class);
	}

	/**
	 * Clears the cache for the osi com total liability.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiComTotalLiability osiComTotalLiability) {
		entityCache.removeResult(
			OsiComTotalLiabilityImpl.class, osiComTotalLiability);
	}

	@Override
	public void clearCache(List<OsiComTotalLiability> osiComTotalLiabilities) {
		for (OsiComTotalLiability osiComTotalLiability :
				osiComTotalLiabilities) {

			entityCache.removeResult(
				OsiComTotalLiabilityImpl.class, osiComTotalLiability);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiComTotalLiabilityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiComTotalLiabilityImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiComTotalLiabilityModelImpl osiComTotalLiabilityModelImpl) {

		Object[] args = new Object[] {
			osiComTotalLiabilityModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, osiComTotalLiabilityModelImpl);
	}

	/**
	 * Creates a new osi com total liability with the primary key. Does not add the osi com total liability to the database.
	 *
	 * @param osiComTotalLiabilityId the primary key for the new osi com total liability
	 * @return the new osi com total liability
	 */
	@Override
	public OsiComTotalLiability create(long osiComTotalLiabilityId) {
		OsiComTotalLiability osiComTotalLiability =
			new OsiComTotalLiabilityImpl();

		osiComTotalLiability.setNew(true);
		osiComTotalLiability.setPrimaryKey(osiComTotalLiabilityId);

		osiComTotalLiability.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiComTotalLiability;
	}

	/**
	 * Removes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public OsiComTotalLiability remove(long osiComTotalLiabilityId)
		throws NoSuchOsiComTotalLiabilityException {

		return remove((Serializable)osiComTotalLiabilityId);
	}

	/**
	 * Removes the osi com total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi com total liability
	 * @return the osi com total liability that was removed
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public OsiComTotalLiability remove(Serializable primaryKey)
		throws NoSuchOsiComTotalLiabilityException {

		Session session = null;

		try {
			session = openSession();

			OsiComTotalLiability osiComTotalLiability =
				(OsiComTotalLiability)session.get(
					OsiComTotalLiabilityImpl.class, primaryKey);

			if (osiComTotalLiability == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiComTotalLiabilityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiComTotalLiability);
		}
		catch (NoSuchOsiComTotalLiabilityException noSuchEntityException) {
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
	protected OsiComTotalLiability removeImpl(
		OsiComTotalLiability osiComTotalLiability) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiComTotalLiability)) {
				osiComTotalLiability = (OsiComTotalLiability)session.get(
					OsiComTotalLiabilityImpl.class,
					osiComTotalLiability.getPrimaryKeyObj());
			}

			if (osiComTotalLiability != null) {
				session.delete(osiComTotalLiability);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiComTotalLiability != null) {
			clearCache(osiComTotalLiability);
		}

		return osiComTotalLiability;
	}

	@Override
	public OsiComTotalLiability updateImpl(
		OsiComTotalLiability osiComTotalLiability) {

		boolean isNew = osiComTotalLiability.isNew();

		if (!(osiComTotalLiability instanceof OsiComTotalLiabilityModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiComTotalLiability.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiComTotalLiability);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiComTotalLiability proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiComTotalLiability implementation " +
					osiComTotalLiability.getClass());
		}

		OsiComTotalLiabilityModelImpl osiComTotalLiabilityModelImpl =
			(OsiComTotalLiabilityModelImpl)osiComTotalLiability;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiComTotalLiability.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiComTotalLiability.setCreateDate(date);
			}
			else {
				osiComTotalLiability.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiComTotalLiabilityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiComTotalLiability.setModifiedDate(date);
			}
			else {
				osiComTotalLiability.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiComTotalLiability);
			}
			else {
				osiComTotalLiability = (OsiComTotalLiability)session.merge(
					osiComTotalLiability);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiComTotalLiabilityImpl.class, osiComTotalLiabilityModelImpl,
			false, true);

		cacheUniqueFindersCache(osiComTotalLiabilityModelImpl);

		if (isNew) {
			osiComTotalLiability.setNew(false);
		}

		osiComTotalLiability.resetOriginalValues();

		return osiComTotalLiability;
	}

	/**
	 * Returns the osi com total liability with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public OsiComTotalLiability findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiComTotalLiabilityException {

		OsiComTotalLiability osiComTotalLiability = fetchByPrimaryKey(
			primaryKey);

		if (osiComTotalLiability == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiComTotalLiabilityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiComTotalLiability;
	}

	/**
	 * Returns the osi com total liability with the primary key or throws a <code>NoSuchOsiComTotalLiabilityException</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability
	 * @throws NoSuchOsiComTotalLiabilityException if a osi com total liability with the primary key could not be found
	 */
	@Override
	public OsiComTotalLiability findByPrimaryKey(long osiComTotalLiabilityId)
		throws NoSuchOsiComTotalLiabilityException {

		return findByPrimaryKey((Serializable)osiComTotalLiabilityId);
	}

	/**
	 * Returns the osi com total liability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComTotalLiabilityId the primary key of the osi com total liability
	 * @return the osi com total liability, or <code>null</code> if a osi com total liability with the primary key could not be found
	 */
	@Override
	public OsiComTotalLiability fetchByPrimaryKey(long osiComTotalLiabilityId) {
		return fetchByPrimaryKey((Serializable)osiComTotalLiabilityId);
	}

	/**
	 * Returns all the osi com total liabilities.
	 *
	 * @return the osi com total liabilities
	 */
	@Override
	public List<OsiComTotalLiability> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @return the range of osi com total liabilities
	 */
	@Override
	public List<OsiComTotalLiability> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com total liabilities
	 */
	@Override
	public List<OsiComTotalLiability> findAll(
		int start, int end,
		OrderByComparator<OsiComTotalLiability> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi com total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com total liabilities
	 * @param end the upper bound of the range of osi com total liabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com total liabilities
	 */
	@Override
	public List<OsiComTotalLiability> findAll(
		int start, int end,
		OrderByComparator<OsiComTotalLiability> orderByComparator,
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

		List<OsiComTotalLiability> list = null;

		if (useFinderCache) {
			list = (List<OsiComTotalLiability>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSICOMTOTALLIABILITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSICOMTOTALLIABILITY;

				sql = sql.concat(OsiComTotalLiabilityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiComTotalLiability>)QueryUtil.list(
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
	 * Removes all the osi com total liabilities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiComTotalLiability osiComTotalLiability : findAll()) {
			remove(osiComTotalLiability);
		}
	}

	/**
	 * Returns the number of osi com total liabilities.
	 *
	 * @return the number of osi com total liabilities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_OSICOMTOTALLIABILITY);

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
		return "osiComTotalLiabilityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSICOMTOTALLIABILITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiComTotalLiabilityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi com total liability persistence.
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

		OsiComTotalLiabilityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiComTotalLiabilityUtil.setPersistence(null);

		entityCache.removeCache(OsiComTotalLiabilityImpl.class.getName());
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

	private static final String _SQL_SELECT_OSICOMTOTALLIABILITY =
		"SELECT osiComTotalLiability FROM OsiComTotalLiability osiComTotalLiability";

	private static final String _SQL_SELECT_OSICOMTOTALLIABILITY_WHERE =
		"SELECT osiComTotalLiability FROM OsiComTotalLiability osiComTotalLiability WHERE ";

	private static final String _SQL_COUNT_OSICOMTOTALLIABILITY =
		"SELECT COUNT(osiComTotalLiability) FROM OsiComTotalLiability osiComTotalLiability";

	private static final String _SQL_COUNT_OSICOMTOTALLIABILITY_WHERE =
		"SELECT COUNT(osiComTotalLiability) FROM OsiComTotalLiability osiComTotalLiability WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiComTotalLiability.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiComTotalLiability exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiComTotalLiability exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiComTotalLiabilityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}