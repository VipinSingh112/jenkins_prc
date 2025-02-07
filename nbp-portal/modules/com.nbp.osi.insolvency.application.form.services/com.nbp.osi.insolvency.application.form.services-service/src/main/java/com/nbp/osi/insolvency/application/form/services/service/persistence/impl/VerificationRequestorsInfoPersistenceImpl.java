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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchVerificationRequestorsInfoException;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfo;
import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfoTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInfoImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInfoModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInfoPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.VerificationRequestorsInfoUtil;
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
 * The persistence implementation for the verification requestors info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = VerificationRequestorsInfoPersistence.class)
public class VerificationRequestorsInfoPersistenceImpl
	extends BasePersistenceImpl<VerificationRequestorsInfo>
	implements VerificationRequestorsInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VerificationRequestorsInfoUtil</code> to access the verification requestors info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VerificationRequestorsInfoImpl.class.getName();

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
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a matching verification requestors info could not be found
	 */
	@Override
	public VerificationRequestorsInfo findBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInfoException {

		VerificationRequestorsInfo verificationRequestorsInfo =
			fetchBygetOsiById(osiInsolvencyId);

		if (verificationRequestorsInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchVerificationRequestorsInfoException(sb.toString());
		}

		return verificationRequestorsInfo;
	}

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	@Override
	public VerificationRequestorsInfo fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	@Override
	public VerificationRequestorsInfo fetchBygetOsiById(
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

		if (result instanceof VerificationRequestorsInfo) {
			VerificationRequestorsInfo verificationRequestorsInfo =
				(VerificationRequestorsInfo)result;

			if (osiInsolvencyId !=
					verificationRequestorsInfo.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_VERIFICATIONREQUESTORSINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<VerificationRequestorsInfo> list = query.list();

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
								"VerificationRequestorsInfoPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VerificationRequestorsInfo verificationRequestorsInfo =
						list.get(0);

					result = verificationRequestorsInfo;

					cacheResult(verificationRequestorsInfo);
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
			return (VerificationRequestorsInfo)result;
		}
	}

	/**
	 * Removes the verification requestors info where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors info that was removed
	 */
	@Override
	public VerificationRequestorsInfo removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchVerificationRequestorsInfoException {

		VerificationRequestorsInfo verificationRequestorsInfo =
			findBygetOsiById(osiInsolvencyId);

		return remove(verificationRequestorsInfo);
	}

	/**
	 * Returns the number of verification requestors infos where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors infos
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VERIFICATIONREQUESTORSINFO_WHERE);

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
		"verificationRequestorsInfo.osiInsolvencyId = ?";

	public VerificationRequestorsInfoPersistenceImpl() {
		setModelClass(VerificationRequestorsInfo.class);

		setModelImplClass(VerificationRequestorsInfoImpl.class);
		setModelPKClass(long.class);

		setTable(VerificationRequestorsInfoTable.INSTANCE);
	}

	/**
	 * Caches the verification requestors info in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 */
	@Override
	public void cacheResult(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		entityCache.putResult(
			VerificationRequestorsInfoImpl.class,
			verificationRequestorsInfo.getPrimaryKey(),
			verificationRequestorsInfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {verificationRequestorsInfo.getOsiInsolvencyId()},
			verificationRequestorsInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the verification requestors infos in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfos the verification requestors infos
	 */
	@Override
	public void cacheResult(
		List<VerificationRequestorsInfo> verificationRequestorsInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (verificationRequestorsInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (VerificationRequestorsInfo verificationRequestorsInfo :
				verificationRequestorsInfos) {

			if (entityCache.getResult(
					VerificationRequestorsInfoImpl.class,
					verificationRequestorsInfo.getPrimaryKey()) == null) {

				cacheResult(verificationRequestorsInfo);
			}
		}
	}

	/**
	 * Clears the cache for all verification requestors infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VerificationRequestorsInfoImpl.class);

		finderCache.clearCache(VerificationRequestorsInfoImpl.class);
	}

	/**
	 * Clears the cache for the verification requestors info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		entityCache.removeResult(
			VerificationRequestorsInfoImpl.class, verificationRequestorsInfo);
	}

	@Override
	public void clearCache(
		List<VerificationRequestorsInfo> verificationRequestorsInfos) {

		for (VerificationRequestorsInfo verificationRequestorsInfo :
				verificationRequestorsInfos) {

			entityCache.removeResult(
				VerificationRequestorsInfoImpl.class,
				verificationRequestorsInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(VerificationRequestorsInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				VerificationRequestorsInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		VerificationRequestorsInfoModelImpl
			verificationRequestorsInfoModelImpl) {

		Object[] args = new Object[] {
			verificationRequestorsInfoModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			verificationRequestorsInfoModelImpl);
	}

	/**
	 * Creates a new verification requestors info with the primary key. Does not add the verification requestors info to the database.
	 *
	 * @param requestorInformationId the primary key for the new verification requestors info
	 * @return the new verification requestors info
	 */
	@Override
	public VerificationRequestorsInfo create(long requestorInformationId) {
		VerificationRequestorsInfo verificationRequestorsInfo =
			new VerificationRequestorsInfoImpl();

		verificationRequestorsInfo.setNew(true);
		verificationRequestorsInfo.setPrimaryKey(requestorInformationId);

		verificationRequestorsInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return verificationRequestorsInfo;
	}

	/**
	 * Removes the verification requestors info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info that was removed
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInfo remove(long requestorInformationId)
		throws NoSuchVerificationRequestorsInfoException {

		return remove((Serializable)requestorInformationId);
	}

	/**
	 * Removes the verification requestors info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the verification requestors info
	 * @return the verification requestors info that was removed
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInfo remove(Serializable primaryKey)
		throws NoSuchVerificationRequestorsInfoException {

		Session session = null;

		try {
			session = openSession();

			VerificationRequestorsInfo verificationRequestorsInfo =
				(VerificationRequestorsInfo)session.get(
					VerificationRequestorsInfoImpl.class, primaryKey);

			if (verificationRequestorsInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVerificationRequestorsInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(verificationRequestorsInfo);
		}
		catch (NoSuchVerificationRequestorsInfoException
					noSuchEntityException) {

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
	protected VerificationRequestorsInfo removeImpl(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(verificationRequestorsInfo)) {
				verificationRequestorsInfo =
					(VerificationRequestorsInfo)session.get(
						VerificationRequestorsInfoImpl.class,
						verificationRequestorsInfo.getPrimaryKeyObj());
			}

			if (verificationRequestorsInfo != null) {
				session.delete(verificationRequestorsInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (verificationRequestorsInfo != null) {
			clearCache(verificationRequestorsInfo);
		}

		return verificationRequestorsInfo;
	}

	@Override
	public VerificationRequestorsInfo updateImpl(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		boolean isNew = verificationRequestorsInfo.isNew();

		if (!(verificationRequestorsInfo instanceof
				VerificationRequestorsInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(verificationRequestorsInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					verificationRequestorsInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in verificationRequestorsInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom VerificationRequestorsInfo implementation " +
					verificationRequestorsInfo.getClass());
		}

		VerificationRequestorsInfoModelImpl
			verificationRequestorsInfoModelImpl =
				(VerificationRequestorsInfoModelImpl)verificationRequestorsInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (verificationRequestorsInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				verificationRequestorsInfo.setCreateDate(date);
			}
			else {
				verificationRequestorsInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!verificationRequestorsInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				verificationRequestorsInfo.setModifiedDate(date);
			}
			else {
				verificationRequestorsInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(verificationRequestorsInfo);
			}
			else {
				verificationRequestorsInfo =
					(VerificationRequestorsInfo)session.merge(
						verificationRequestorsInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			VerificationRequestorsInfoImpl.class,
			verificationRequestorsInfoModelImpl, false, true);

		cacheUniqueFindersCache(verificationRequestorsInfoModelImpl);

		if (isNew) {
			verificationRequestorsInfo.setNew(false);
		}

		verificationRequestorsInfo.resetOriginalValues();

		return verificationRequestorsInfo;
	}

	/**
	 * Returns the verification requestors info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the verification requestors info
	 * @return the verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVerificationRequestorsInfoException {

		VerificationRequestorsInfo verificationRequestorsInfo =
			fetchByPrimaryKey(primaryKey);

		if (verificationRequestorsInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVerificationRequestorsInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return verificationRequestorsInfo;
	}

	/**
	 * Returns the verification requestors info with the primary key or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInfo findByPrimaryKey(
			long requestorInformationId)
		throws NoSuchVerificationRequestorsInfoException {

		return findByPrimaryKey((Serializable)requestorInformationId);
	}

	/**
	 * Returns the verification requestors info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info, or <code>null</code> if a verification requestors info with the primary key could not be found
	 */
	@Override
	public VerificationRequestorsInfo fetchByPrimaryKey(
		long requestorInformationId) {

		return fetchByPrimaryKey((Serializable)requestorInformationId);
	}

	/**
	 * Returns all the verification requestors infos.
	 *
	 * @return the verification requestors infos
	 */
	@Override
	public List<VerificationRequestorsInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @return the range of verification requestors infos
	 */
	@Override
	public List<VerificationRequestorsInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors infos
	 */
	@Override
	public List<VerificationRequestorsInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors infos
	 */
	@Override
	public List<VerificationRequestorsInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInfo> orderByComparator,
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

		List<VerificationRequestorsInfo> list = null;

		if (useFinderCache) {
			list = (List<VerificationRequestorsInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VERIFICATIONREQUESTORSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VERIFICATIONREQUESTORSINFO;

				sql = sql.concat(
					VerificationRequestorsInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<VerificationRequestorsInfo>)QueryUtil.list(
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
	 * Removes all the verification requestors infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VerificationRequestorsInfo verificationRequestorsInfo :
				findAll()) {

			remove(verificationRequestorsInfo);
		}
	}

	/**
	 * Returns the number of verification requestors infos.
	 *
	 * @return the number of verification requestors infos
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
					_SQL_COUNT_VERIFICATIONREQUESTORSINFO);

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
		return "requestorInformationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VERIFICATIONREQUESTORSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VerificationRequestorsInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the verification requestors info persistence.
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

		VerificationRequestorsInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		VerificationRequestorsInfoUtil.setPersistence(null);

		entityCache.removeCache(VerificationRequestorsInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_VERIFICATIONREQUESTORSINFO =
		"SELECT verificationRequestorsInfo FROM VerificationRequestorsInfo verificationRequestorsInfo";

	private static final String _SQL_SELECT_VERIFICATIONREQUESTORSINFO_WHERE =
		"SELECT verificationRequestorsInfo FROM VerificationRequestorsInfo verificationRequestorsInfo WHERE ";

	private static final String _SQL_COUNT_VERIFICATIONREQUESTORSINFO =
		"SELECT COUNT(verificationRequestorsInfo) FROM VerificationRequestorsInfo verificationRequestorsInfo";

	private static final String _SQL_COUNT_VERIFICATIONREQUESTORSINFO_WHERE =
		"SELECT COUNT(verificationRequestorsInfo) FROM VerificationRequestorsInfo verificationRequestorsInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"verificationRequestorsInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No VerificationRequestorsInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No VerificationRequestorsInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VerificationRequestorsInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}