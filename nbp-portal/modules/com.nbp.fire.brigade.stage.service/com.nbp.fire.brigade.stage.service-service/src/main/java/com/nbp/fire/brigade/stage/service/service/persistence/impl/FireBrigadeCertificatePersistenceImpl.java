/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence.impl;

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

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeCertificateException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificateTable;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateImpl;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeCertificatePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeCertificateUtil;
import com.nbp.fire.brigade.stage.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
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
 * The persistence implementation for the fire brigade certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeCertificatePersistence.class)
public class FireBrigadeCertificatePersistenceImpl
	extends BasePersistenceImpl<FireBrigadeCertificate>
	implements FireBrigadeCertificatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeCertificateUtil</code> to access the fire brigade certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeCertificateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFireBrigadeCertificateByCaseId;
	private FinderPath _finderPathCountBygetFireBrigadeCertificateByCaseId;

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a matching fire brigade certificate could not be found
	 */
	@Override
	public FireBrigadeCertificate findBygetFireBrigadeCertificateByCaseId(
			String caseId)
		throws NoSuchFireBrigadeCertificateException {

		FireBrigadeCertificate fireBrigadeCertificate =
			fetchBygetFireBrigadeCertificateByCaseId(caseId);

		if (fireBrigadeCertificate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeCertificateException(sb.toString());
		}

		return fireBrigadeCertificate;
	}

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	@Override
	public FireBrigadeCertificate fetchBygetFireBrigadeCertificateByCaseId(
		String caseId) {

		return fetchBygetFireBrigadeCertificateByCaseId(caseId, true);
	}

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	@Override
	public FireBrigadeCertificate fetchBygetFireBrigadeCertificateByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeCertificateByCaseId, finderArgs,
				this);
		}

		if (result instanceof FireBrigadeCertificate) {
			FireBrigadeCertificate fireBrigadeCertificate =
				(FireBrigadeCertificate)result;

			if (!Objects.equals(caseId, fireBrigadeCertificate.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FireBrigadeCertificate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeCertificateByCaseId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FireBrigadeCertificatePersistenceImpl.fetchBygetFireBrigadeCertificateByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeCertificate fireBrigadeCertificate = list.get(0);

					result = fireBrigadeCertificate;

					cacheResult(fireBrigadeCertificate);
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
			return (FireBrigadeCertificate)result;
		}
	}

	/**
	 * Removes the fire brigade certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade certificate that was removed
	 */
	@Override
	public FireBrigadeCertificate removeBygetFireBrigadeCertificateByCaseId(
			String caseId)
		throws NoSuchFireBrigadeCertificateException {

		FireBrigadeCertificate fireBrigadeCertificate =
			findBygetFireBrigadeCertificateByCaseId(caseId);

		return remove(fireBrigadeCertificate);
	}

	/**
	 * Returns the number of fire brigade certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade certificates
	 */
	@Override
	public int countBygetFireBrigadeCertificateByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetFireBrigadeCertificateByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
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

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_2 =
			"fireBrigadeCertificate.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADECERTIFICATEBYCASEID_CASEID_3 =
			"(fireBrigadeCertificate.caseId IS NULL OR fireBrigadeCertificate.caseId = '')";

	public FireBrigadeCertificatePersistenceImpl() {
		setModelClass(FireBrigadeCertificate.class);

		setModelImplClass(FireBrigadeCertificateImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeCertificateTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade certificate in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 */
	@Override
	public void cacheResult(FireBrigadeCertificate fireBrigadeCertificate) {
		entityCache.putResult(
			FireBrigadeCertificateImpl.class,
			fireBrigadeCertificate.getPrimaryKey(), fireBrigadeCertificate);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeCertificateByCaseId,
			new Object[] {fireBrigadeCertificate.getCaseId()},
			fireBrigadeCertificate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade certificates in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificates the fire brigade certificates
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeCertificate> fireBrigadeCertificates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeCertificates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeCertificate fireBrigadeCertificate :
				fireBrigadeCertificates) {

			if (entityCache.getResult(
					FireBrigadeCertificateImpl.class,
					fireBrigadeCertificate.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeCertificate);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade certificates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeCertificateImpl.class);

		finderCache.clearCache(FireBrigadeCertificateImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade certificate.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeCertificate fireBrigadeCertificate) {
		entityCache.removeResult(
			FireBrigadeCertificateImpl.class, fireBrigadeCertificate);
	}

	@Override
	public void clearCache(
		List<FireBrigadeCertificate> fireBrigadeCertificates) {

		for (FireBrigadeCertificate fireBrigadeCertificate :
				fireBrigadeCertificates) {

			entityCache.removeResult(
				FireBrigadeCertificateImpl.class, fireBrigadeCertificate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeCertificateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeCertificateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeCertificateModelImpl fireBrigadeCertificateModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeCertificateModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeCertificateByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeCertificateByCaseId, args,
			fireBrigadeCertificateModelImpl);
	}

	/**
	 * Creates a new fire brigade certificate with the primary key. Does not add the fire brigade certificate to the database.
	 *
	 * @param fireBrigadeCertificateId the primary key for the new fire brigade certificate
	 * @return the new fire brigade certificate
	 */
	@Override
	public FireBrigadeCertificate create(long fireBrigadeCertificateId) {
		FireBrigadeCertificate fireBrigadeCertificate =
			new FireBrigadeCertificateImpl();

		fireBrigadeCertificate.setNew(true);
		fireBrigadeCertificate.setPrimaryKey(fireBrigadeCertificateId);

		fireBrigadeCertificate.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fireBrigadeCertificate;
	}

	/**
	 * Removes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public FireBrigadeCertificate remove(long fireBrigadeCertificateId)
		throws NoSuchFireBrigadeCertificateException {

		return remove((Serializable)fireBrigadeCertificateId);
	}

	/**
	 * Removes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public FireBrigadeCertificate remove(Serializable primaryKey)
		throws NoSuchFireBrigadeCertificateException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeCertificate fireBrigadeCertificate =
				(FireBrigadeCertificate)session.get(
					FireBrigadeCertificateImpl.class, primaryKey);

			if (fireBrigadeCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeCertificateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeCertificate);
		}
		catch (NoSuchFireBrigadeCertificateException noSuchEntityException) {
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
	protected FireBrigadeCertificate removeImpl(
		FireBrigadeCertificate fireBrigadeCertificate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeCertificate)) {
				fireBrigadeCertificate = (FireBrigadeCertificate)session.get(
					FireBrigadeCertificateImpl.class,
					fireBrigadeCertificate.getPrimaryKeyObj());
			}

			if (fireBrigadeCertificate != null) {
				session.delete(fireBrigadeCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeCertificate != null) {
			clearCache(fireBrigadeCertificate);
		}

		return fireBrigadeCertificate;
	}

	@Override
	public FireBrigadeCertificate updateImpl(
		FireBrigadeCertificate fireBrigadeCertificate) {

		boolean isNew = fireBrigadeCertificate.isNew();

		if (!(fireBrigadeCertificate instanceof
				FireBrigadeCertificateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeCertificate.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeCertificate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeCertificate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeCertificate implementation " +
					fireBrigadeCertificate.getClass());
		}

		FireBrigadeCertificateModelImpl fireBrigadeCertificateModelImpl =
			(FireBrigadeCertificateModelImpl)fireBrigadeCertificate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeCertificate.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeCertificate.setCreateDate(date);
			}
			else {
				fireBrigadeCertificate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeCertificateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeCertificate.setModifiedDate(date);
			}
			else {
				fireBrigadeCertificate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeCertificate);
			}
			else {
				fireBrigadeCertificate = (FireBrigadeCertificate)session.merge(
					fireBrigadeCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeCertificateImpl.class, fireBrigadeCertificateModelImpl,
			false, true);

		cacheUniqueFindersCache(fireBrigadeCertificateModelImpl);

		if (isNew) {
			fireBrigadeCertificate.setNew(false);
		}

		fireBrigadeCertificate.resetOriginalValues();

		return fireBrigadeCertificate;
	}

	/**
	 * Returns the fire brigade certificate with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public FireBrigadeCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeCertificateException {

		FireBrigadeCertificate fireBrigadeCertificate = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeCertificateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeCertificate;
	}

	/**
	 * Returns the fire brigade certificate with the primary key or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public FireBrigadeCertificate findByPrimaryKey(
			long fireBrigadeCertificateId)
		throws NoSuchFireBrigadeCertificateException {

		return findByPrimaryKey((Serializable)fireBrigadeCertificateId);
	}

	/**
	 * Returns the fire brigade certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate, or <code>null</code> if a fire brigade certificate with the primary key could not be found
	 */
	@Override
	public FireBrigadeCertificate fetchByPrimaryKey(
		long fireBrigadeCertificateId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeCertificateId);
	}

	/**
	 * Returns all the fire brigade certificates.
	 *
	 * @return the fire brigade certificates
	 */
	@Override
	public List<FireBrigadeCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @return the range of fire brigade certificates
	 */
	@Override
	public List<FireBrigadeCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade certificates
	 */
	@Override
	public List<FireBrigadeCertificate> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCertificate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade certificates
	 */
	@Override
	public List<FireBrigadeCertificate> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCertificate> orderByComparator,
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

		List<FireBrigadeCertificate> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADECERTIFICATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADECERTIFICATE;

				sql = sql.concat(FireBrigadeCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeCertificate>)QueryUtil.list(
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
	 * Removes all the fire brigade certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeCertificate fireBrigadeCertificate : findAll()) {
			remove(fireBrigadeCertificate);
		}
	}

	/**
	 * Returns the number of fire brigade certificates.
	 *
	 * @return the number of fire brigade certificates
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
					_SQL_COUNT_FIREBRIGADECERTIFICATE);

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
		return "fireBrigadeCertificateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADECERTIFICATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade certificate persistence.
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

		_finderPathFetchBygetFireBrigadeCertificateByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY,
			"fetchBygetFireBrigadeCertificateByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFireBrigadeCertificateByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeCertificateByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FireBrigadeCertificateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeCertificateUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeCertificateImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADECERTIFICATE =
		"SELECT fireBrigadeCertificate FROM FireBrigadeCertificate fireBrigadeCertificate";

	private static final String _SQL_SELECT_FIREBRIGADECERTIFICATE_WHERE =
		"SELECT fireBrigadeCertificate FROM FireBrigadeCertificate fireBrigadeCertificate WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADECERTIFICATE =
		"SELECT COUNT(fireBrigadeCertificate) FROM FireBrigadeCertificate fireBrigadeCertificate";

	private static final String _SQL_COUNT_FIREBRIGADECERTIFICATE_WHERE =
		"SELECT COUNT(fireBrigadeCertificate) FROM FireBrigadeCertificate fireBrigadeCertificate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeCertificate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeCertificate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeCertificate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeCertificatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}