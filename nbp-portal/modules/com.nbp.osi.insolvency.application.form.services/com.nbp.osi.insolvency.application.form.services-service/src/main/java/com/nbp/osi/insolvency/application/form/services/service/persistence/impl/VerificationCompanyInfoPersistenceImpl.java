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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchVerificationCompanyInfoException;
import com.nbp.osi.insolvency.application.form.services.model.VerificationCompanyInfo;
import com.nbp.osi.insolvency.application.form.services.model.VerificationCompanyInfoTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationCompanyInfoImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationCompanyInfoModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationCompanyInfoPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationCompanyInfoUtil;
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
 * The persistence implementation for the verification company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = VerificationCompanyInfoPersistence.class)
public class VerificationCompanyInfoPersistenceImpl
	extends BasePersistenceImpl<VerificationCompanyInfo>
	implements VerificationCompanyInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VerificationCompanyInfoUtil</code> to access the verification company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VerificationCompanyInfoImpl.class.getName();

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
	 * Returns the verification company info where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationCompanyInfoException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification company info
	 * @throws NoSuchVerificationCompanyInfoException if a matching verification company info could not be found
	 */
	@Override
	public VerificationCompanyInfo findBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationCompanyInfoException {

		VerificationCompanyInfo verificationCompanyInfo = fetchBygetOsiById(
			osiInsolvencyId);

		if (verificationCompanyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchVerificationCompanyInfoException(sb.toString());
		}

		return verificationCompanyInfo;
	}

	/**
	 * Returns the verification company info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification company info, or <code>null</code> if a matching verification company info could not be found
	 */
	@Override
	public VerificationCompanyInfo fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the verification company info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification company info, or <code>null</code> if a matching verification company info could not be found
	 */
	@Override
	public VerificationCompanyInfo fetchBygetOsiById(
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

		if (result instanceof VerificationCompanyInfo) {
			VerificationCompanyInfo verificationCompanyInfo =
				(VerificationCompanyInfo)result;

			if (osiInsolvencyId !=
					verificationCompanyInfo.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_VERIFICATIONCOMPANYINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<VerificationCompanyInfo> list = query.list();

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
								"VerificationCompanyInfoPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VerificationCompanyInfo verificationCompanyInfo = list.get(
						0);

					result = verificationCompanyInfo;

					cacheResult(verificationCompanyInfo);
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
			return (VerificationCompanyInfo)result;
		}
	}

	/**
	 * Removes the verification company info where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification company info that was removed
	 */
	@Override
	public VerificationCompanyInfo removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationCompanyInfoException {

		VerificationCompanyInfo verificationCompanyInfo = findBygetOsiById(
			osiInsolvencyId);

		return remove(verificationCompanyInfo);
	}

	/**
	 * Returns the number of verification company infos where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification company infos
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VERIFICATIONCOMPANYINFO_WHERE);

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
		"verificationCompanyInfo.osiInsolvencyId = ?";

	public VerificationCompanyInfoPersistenceImpl() {
		setModelClass(VerificationCompanyInfo.class);

		setModelImplClass(VerificationCompanyInfoImpl.class);
		setModelPKClass(long.class);

		setTable(VerificationCompanyInfoTable.INSTANCE);
	}

	/**
	 * Caches the verification company info in the entity cache if it is enabled.
	 *
	 * @param verificationCompanyInfo the verification company info
	 */
	@Override
	public void cacheResult(VerificationCompanyInfo verificationCompanyInfo) {
		entityCache.putResult(
			VerificationCompanyInfoImpl.class,
			verificationCompanyInfo.getPrimaryKey(), verificationCompanyInfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {verificationCompanyInfo.getOsiInsolvencyId()},
			verificationCompanyInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the verification company infos in the entity cache if it is enabled.
	 *
	 * @param verificationCompanyInfos the verification company infos
	 */
	@Override
	public void cacheResult(
		List<VerificationCompanyInfo> verificationCompanyInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (verificationCompanyInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (VerificationCompanyInfo verificationCompanyInfo :
				verificationCompanyInfos) {

			if (entityCache.getResult(
					VerificationCompanyInfoImpl.class,
					verificationCompanyInfo.getPrimaryKey()) == null) {

				cacheResult(verificationCompanyInfo);
			}
		}
	}

	/**
	 * Clears the cache for all verification company infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VerificationCompanyInfoImpl.class);

		finderCache.clearCache(VerificationCompanyInfoImpl.class);
	}

	/**
	 * Clears the cache for the verification company info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VerificationCompanyInfo verificationCompanyInfo) {
		entityCache.removeResult(
			VerificationCompanyInfoImpl.class, verificationCompanyInfo);
	}

	@Override
	public void clearCache(
		List<VerificationCompanyInfo> verificationCompanyInfos) {

		for (VerificationCompanyInfo verificationCompanyInfo :
				verificationCompanyInfos) {

			entityCache.removeResult(
				VerificationCompanyInfoImpl.class, verificationCompanyInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(VerificationCompanyInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				VerificationCompanyInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		VerificationCompanyInfoModelImpl verificationCompanyInfoModelImpl) {

		Object[] args = new Object[] {
			verificationCompanyInfoModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			verificationCompanyInfoModelImpl);
	}

	/**
	 * Creates a new verification company info with the primary key. Does not add the verification company info to the database.
	 *
	 * @param verificationCompanyInfoId the primary key for the new verification company info
	 * @return the new verification company info
	 */
	@Override
	public VerificationCompanyInfo create(long verificationCompanyInfoId) {
		VerificationCompanyInfo verificationCompanyInfo =
			new VerificationCompanyInfoImpl();

		verificationCompanyInfo.setNew(true);
		verificationCompanyInfo.setPrimaryKey(verificationCompanyInfoId);

		verificationCompanyInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return verificationCompanyInfo;
	}

	/**
	 * Removes the verification company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info that was removed
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	@Override
	public VerificationCompanyInfo remove(long verificationCompanyInfoId)
		throws NoSuchVerificationCompanyInfoException {

		return remove((Serializable)verificationCompanyInfoId);
	}

	/**
	 * Removes the verification company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the verification company info
	 * @return the verification company info that was removed
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	@Override
	public VerificationCompanyInfo remove(Serializable primaryKey)
		throws NoSuchVerificationCompanyInfoException {

		Session session = null;

		try {
			session = openSession();

			VerificationCompanyInfo verificationCompanyInfo =
				(VerificationCompanyInfo)session.get(
					VerificationCompanyInfoImpl.class, primaryKey);

			if (verificationCompanyInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVerificationCompanyInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(verificationCompanyInfo);
		}
		catch (NoSuchVerificationCompanyInfoException noSuchEntityException) {
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
	protected VerificationCompanyInfo removeImpl(
		VerificationCompanyInfo verificationCompanyInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(verificationCompanyInfo)) {
				verificationCompanyInfo = (VerificationCompanyInfo)session.get(
					VerificationCompanyInfoImpl.class,
					verificationCompanyInfo.getPrimaryKeyObj());
			}

			if (verificationCompanyInfo != null) {
				session.delete(verificationCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (verificationCompanyInfo != null) {
			clearCache(verificationCompanyInfo);
		}

		return verificationCompanyInfo;
	}

	@Override
	public VerificationCompanyInfo updateImpl(
		VerificationCompanyInfo verificationCompanyInfo) {

		boolean isNew = verificationCompanyInfo.isNew();

		if (!(verificationCompanyInfo instanceof
				VerificationCompanyInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(verificationCompanyInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					verificationCompanyInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in verificationCompanyInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VerificationCompanyInfo implementation " +
					verificationCompanyInfo.getClass());
		}

		VerificationCompanyInfoModelImpl verificationCompanyInfoModelImpl =
			(VerificationCompanyInfoModelImpl)verificationCompanyInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (verificationCompanyInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				verificationCompanyInfo.setCreateDate(date);
			}
			else {
				verificationCompanyInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!verificationCompanyInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				verificationCompanyInfo.setModifiedDate(date);
			}
			else {
				verificationCompanyInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(verificationCompanyInfo);
			}
			else {
				verificationCompanyInfo =
					(VerificationCompanyInfo)session.merge(
						verificationCompanyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			VerificationCompanyInfoImpl.class, verificationCompanyInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(verificationCompanyInfoModelImpl);

		if (isNew) {
			verificationCompanyInfo.setNew(false);
		}

		verificationCompanyInfo.resetOriginalValues();

		return verificationCompanyInfo;
	}

	/**
	 * Returns the verification company info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the verification company info
	 * @return the verification company info
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	@Override
	public VerificationCompanyInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVerificationCompanyInfoException {

		VerificationCompanyInfo verificationCompanyInfo = fetchByPrimaryKey(
			primaryKey);

		if (verificationCompanyInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVerificationCompanyInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return verificationCompanyInfo;
	}

	/**
	 * Returns the verification company info with the primary key or throws a <code>NoSuchVerificationCompanyInfoException</code> if it could not be found.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	@Override
	public VerificationCompanyInfo findByPrimaryKey(
			long verificationCompanyInfoId)
		throws NoSuchVerificationCompanyInfoException {

		return findByPrimaryKey((Serializable)verificationCompanyInfoId);
	}

	/**
	 * Returns the verification company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info, or <code>null</code> if a verification company info with the primary key could not be found
	 */
	@Override
	public VerificationCompanyInfo fetchByPrimaryKey(
		long verificationCompanyInfoId) {

		return fetchByPrimaryKey((Serializable)verificationCompanyInfoId);
	}

	/**
	 * Returns all the verification company infos.
	 *
	 * @return the verification company infos
	 */
	@Override
	public List<VerificationCompanyInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @return the range of verification company infos
	 */
	@Override
	public List<VerificationCompanyInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification company infos
	 */
	@Override
	public List<VerificationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationCompanyInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification company infos
	 */
	@Override
	public List<VerificationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationCompanyInfo> orderByComparator,
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

		List<VerificationCompanyInfo> list = null;

		if (useFinderCache) {
			list = (List<VerificationCompanyInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VERIFICATIONCOMPANYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VERIFICATIONCOMPANYINFO;

				sql = sql.concat(
					VerificationCompanyInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<VerificationCompanyInfo>)QueryUtil.list(
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
	 * Removes all the verification company infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VerificationCompanyInfo verificationCompanyInfo : findAll()) {
			remove(verificationCompanyInfo);
		}
	}

	/**
	 * Returns the number of verification company infos.
	 *
	 * @return the number of verification company infos
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
					_SQL_COUNT_VERIFICATIONCOMPANYINFO);

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
		return "verificationCompanyInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VERIFICATIONCOMPANYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VerificationCompanyInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the verification company info persistence.
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

		VerificationCompanyInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		VerificationCompanyInfoUtil.setPersistence(null);

		entityCache.removeCache(VerificationCompanyInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_VERIFICATIONCOMPANYINFO =
		"SELECT verificationCompanyInfo FROM VerificationCompanyInfo verificationCompanyInfo";

	private static final String _SQL_SELECT_VERIFICATIONCOMPANYINFO_WHERE =
		"SELECT verificationCompanyInfo FROM VerificationCompanyInfo verificationCompanyInfo WHERE ";

	private static final String _SQL_COUNT_VERIFICATIONCOMPANYINFO =
		"SELECT COUNT(verificationCompanyInfo) FROM VerificationCompanyInfo verificationCompanyInfo";

	private static final String _SQL_COUNT_VERIFICATIONCOMPANYINFO_WHERE =
		"SELECT COUNT(verificationCompanyInfo) FROM VerificationCompanyInfo verificationCompanyInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"verificationCompanyInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No VerificationCompanyInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No VerificationCompanyInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VerificationCompanyInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}