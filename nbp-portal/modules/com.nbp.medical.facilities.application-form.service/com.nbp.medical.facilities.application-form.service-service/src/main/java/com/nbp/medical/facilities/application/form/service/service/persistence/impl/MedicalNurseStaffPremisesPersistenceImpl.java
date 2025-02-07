/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence.impl;

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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalNurseStaffPremisesException;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremisesTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

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
 * The persistence implementation for the medical nurse staff premises service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalNurseStaffPremisesPersistence.class)
public class MedicalNurseStaffPremisesPersistenceImpl
	extends BasePersistenceImpl<MedicalNurseStaffPremises>
	implements MedicalNurseStaffPremisesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalNurseStaffPremisesUtil</code> to access the medical nurse staff premises persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalNurseStaffPremisesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMedicalFacilities_ByAppId;
	private FinderPath _finderPathCountBygetMedicalFacilities_ByAppId;

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a matching medical nurse staff premises could not be found
	 */
	@Override
	public MedicalNurseStaffPremises findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalNurseStaffPremisesException {

		MedicalNurseStaffPremises medicalNurseStaffPremises =
			fetchBygetMedicalFacilities_ByAppId(medicalFacilitiesAppId);

		if (medicalNurseStaffPremises == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalNurseStaffPremisesException(sb.toString());
		}

		return medicalNurseStaffPremises;
	}

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	@Override
	public MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	@Override
	public MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalFacilities_ByAppId, finderArgs,
				this);
		}

		if (result instanceof MedicalNurseStaffPremises) {
			MedicalNurseStaffPremises medicalNurseStaffPremises =
				(MedicalNurseStaffPremises)result;

			if (medicalFacilitiesAppId !=
					medicalNurseStaffPremises.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALNURSESTAFFPREMISES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalNurseStaffPremises> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalFacilities_ByAppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									medicalFacilitiesAppId
								};
							}

							_log.warn(
								"MedicalNurseStaffPremisesPersistenceImpl.fetchBygetMedicalFacilities_ByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalNurseStaffPremises medicalNurseStaffPremises =
						list.get(0);

					result = medicalNurseStaffPremises;

					cacheResult(medicalNurseStaffPremises);
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
			return (MedicalNurseStaffPremises)result;
		}
	}

	/**
	 * Removes the medical nurse staff premises where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical nurse staff premises that was removed
	 */
	@Override
	public MedicalNurseStaffPremises removeBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalNurseStaffPremisesException {

		MedicalNurseStaffPremises medicalNurseStaffPremises =
			findBygetMedicalFacilities_ByAppId(medicalFacilitiesAppId);

		return remove(medicalNurseStaffPremises);
	}

	/**
	 * Returns the number of medical nurse staff premiseses where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical nurse staff premiseses
	 */
	@Override
	public int countBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		FinderPath finderPath = _finderPathCountBygetMedicalFacilities_ByAppId;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALNURSESTAFFPREMISES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

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
		_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2 =
			"medicalNurseStaffPremises.medicalFacilitiesAppId = ?";

	public MedicalNurseStaffPremisesPersistenceImpl() {
		setModelClass(MedicalNurseStaffPremises.class);

		setModelImplClass(MedicalNurseStaffPremisesImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalNurseStaffPremisesTable.INSTANCE);
	}

	/**
	 * Caches the medical nurse staff premises in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 */
	@Override
	public void cacheResult(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		entityCache.putResult(
			MedicalNurseStaffPremisesImpl.class,
			medicalNurseStaffPremises.getPrimaryKey(),
			medicalNurseStaffPremises);

		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilities_ByAppId,
			new Object[] {
				medicalNurseStaffPremises.getMedicalFacilitiesAppId()
			},
			medicalNurseStaffPremises);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical nurse staff premiseses in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremiseses the medical nurse staff premiseses
	 */
	@Override
	public void cacheResult(
		List<MedicalNurseStaffPremises> medicalNurseStaffPremiseses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalNurseStaffPremiseses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalNurseStaffPremises medicalNurseStaffPremises :
				medicalNurseStaffPremiseses) {

			if (entityCache.getResult(
					MedicalNurseStaffPremisesImpl.class,
					medicalNurseStaffPremises.getPrimaryKey()) == null) {

				cacheResult(medicalNurseStaffPremises);
			}
		}
	}

	/**
	 * Clears the cache for all medical nurse staff premiseses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalNurseStaffPremisesImpl.class);

		finderCache.clearCache(MedicalNurseStaffPremisesImpl.class);
	}

	/**
	 * Clears the cache for the medical nurse staff premises.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		entityCache.removeResult(
			MedicalNurseStaffPremisesImpl.class, medicalNurseStaffPremises);
	}

	@Override
	public void clearCache(
		List<MedicalNurseStaffPremises> medicalNurseStaffPremiseses) {

		for (MedicalNurseStaffPremises medicalNurseStaffPremises :
				medicalNurseStaffPremiseses) {

			entityCache.removeResult(
				MedicalNurseStaffPremisesImpl.class, medicalNurseStaffPremises);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalNurseStaffPremisesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalNurseStaffPremisesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalNurseStaffPremisesModelImpl medicalNurseStaffPremisesModelImpl) {

		Object[] args = new Object[] {
			medicalNurseStaffPremisesModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalFacilities_ByAppId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilities_ByAppId, args,
			medicalNurseStaffPremisesModelImpl);
	}

	/**
	 * Creates a new medical nurse staff premises with the primary key. Does not add the medical nurse staff premises to the database.
	 *
	 * @param medicalNurseStaffPremisesId the primary key for the new medical nurse staff premises
	 * @return the new medical nurse staff premises
	 */
	@Override
	public MedicalNurseStaffPremises create(long medicalNurseStaffPremisesId) {
		MedicalNurseStaffPremises medicalNurseStaffPremises =
			new MedicalNurseStaffPremisesImpl();

		medicalNurseStaffPremises.setNew(true);
		medicalNurseStaffPremises.setPrimaryKey(medicalNurseStaffPremisesId);

		medicalNurseStaffPremises.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalNurseStaffPremises;
	}

	/**
	 * Removes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public MedicalNurseStaffPremises remove(long medicalNurseStaffPremisesId)
		throws NoSuchMedicalNurseStaffPremisesException {

		return remove((Serializable)medicalNurseStaffPremisesId);
	}

	/**
	 * Removes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public MedicalNurseStaffPremises remove(Serializable primaryKey)
		throws NoSuchMedicalNurseStaffPremisesException {

		Session session = null;

		try {
			session = openSession();

			MedicalNurseStaffPremises medicalNurseStaffPremises =
				(MedicalNurseStaffPremises)session.get(
					MedicalNurseStaffPremisesImpl.class, primaryKey);

			if (medicalNurseStaffPremises == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalNurseStaffPremisesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalNurseStaffPremises);
		}
		catch (NoSuchMedicalNurseStaffPremisesException noSuchEntityException) {
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
	protected MedicalNurseStaffPremises removeImpl(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalNurseStaffPremises)) {
				medicalNurseStaffPremises =
					(MedicalNurseStaffPremises)session.get(
						MedicalNurseStaffPremisesImpl.class,
						medicalNurseStaffPremises.getPrimaryKeyObj());
			}

			if (medicalNurseStaffPremises != null) {
				session.delete(medicalNurseStaffPremises);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalNurseStaffPremises != null) {
			clearCache(medicalNurseStaffPremises);
		}

		return medicalNurseStaffPremises;
	}

	@Override
	public MedicalNurseStaffPremises updateImpl(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		boolean isNew = medicalNurseStaffPremises.isNew();

		if (!(medicalNurseStaffPremises instanceof
				MedicalNurseStaffPremisesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalNurseStaffPremises.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalNurseStaffPremises);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalNurseStaffPremises proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalNurseStaffPremises implementation " +
					medicalNurseStaffPremises.getClass());
		}

		MedicalNurseStaffPremisesModelImpl medicalNurseStaffPremisesModelImpl =
			(MedicalNurseStaffPremisesModelImpl)medicalNurseStaffPremises;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalNurseStaffPremises.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalNurseStaffPremises.setCreateDate(date);
			}
			else {
				medicalNurseStaffPremises.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalNurseStaffPremisesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalNurseStaffPremises.setModifiedDate(date);
			}
			else {
				medicalNurseStaffPremises.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalNurseStaffPremises);
			}
			else {
				medicalNurseStaffPremises =
					(MedicalNurseStaffPremises)session.merge(
						medicalNurseStaffPremises);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalNurseStaffPremisesImpl.class,
			medicalNurseStaffPremisesModelImpl, false, true);

		cacheUniqueFindersCache(medicalNurseStaffPremisesModelImpl);

		if (isNew) {
			medicalNurseStaffPremises.setNew(false);
		}

		medicalNurseStaffPremises.resetOriginalValues();

		return medicalNurseStaffPremises;
	}

	/**
	 * Returns the medical nurse staff premises with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public MedicalNurseStaffPremises findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalNurseStaffPremisesException {

		MedicalNurseStaffPremises medicalNurseStaffPremises = fetchByPrimaryKey(
			primaryKey);

		if (medicalNurseStaffPremises == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalNurseStaffPremisesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalNurseStaffPremises;
	}

	/**
	 * Returns the medical nurse staff premises with the primary key or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public MedicalNurseStaffPremises findByPrimaryKey(
			long medicalNurseStaffPremisesId)
		throws NoSuchMedicalNurseStaffPremisesException {

		return findByPrimaryKey((Serializable)medicalNurseStaffPremisesId);
	}

	/**
	 * Returns the medical nurse staff premises with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises, or <code>null</code> if a medical nurse staff premises with the primary key could not be found
	 */
	@Override
	public MedicalNurseStaffPremises fetchByPrimaryKey(
		long medicalNurseStaffPremisesId) {

		return fetchByPrimaryKey((Serializable)medicalNurseStaffPremisesId);
	}

	/**
	 * Returns all the medical nurse staff premiseses.
	 *
	 * @return the medical nurse staff premiseses
	 */
	@Override
	public List<MedicalNurseStaffPremises> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @return the range of medical nurse staff premiseses
	 */
	@Override
	public List<MedicalNurseStaffPremises> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical nurse staff premiseses
	 */
	@Override
	public List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		OrderByComparator<MedicalNurseStaffPremises> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical nurse staff premiseses
	 */
	@Override
	public List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		OrderByComparator<MedicalNurseStaffPremises> orderByComparator,
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

		List<MedicalNurseStaffPremises> list = null;

		if (useFinderCache) {
			list = (List<MedicalNurseStaffPremises>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALNURSESTAFFPREMISES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALNURSESTAFFPREMISES;

				sql = sql.concat(
					MedicalNurseStaffPremisesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalNurseStaffPremises>)QueryUtil.list(
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
	 * Removes all the medical nurse staff premiseses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalNurseStaffPremises medicalNurseStaffPremises : findAll()) {
			remove(medicalNurseStaffPremises);
		}
	}

	/**
	 * Returns the number of medical nurse staff premiseses.
	 *
	 * @return the number of medical nurse staff premiseses
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
					_SQL_COUNT_MEDICALNURSESTAFFPREMISES);

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
		return "medicalNurseStaffPremisesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALNURSESTAFFPREMISES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalNurseStaffPremisesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical nurse staff premises persistence.
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

		_finderPathFetchBygetMedicalFacilities_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalFacilities_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilities_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilities_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalNurseStaffPremisesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalNurseStaffPremisesUtil.setPersistence(null);

		entityCache.removeCache(MedicalNurseStaffPremisesImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALNURSESTAFFPREMISES =
		"SELECT medicalNurseStaffPremises FROM MedicalNurseStaffPremises medicalNurseStaffPremises";

	private static final String _SQL_SELECT_MEDICALNURSESTAFFPREMISES_WHERE =
		"SELECT medicalNurseStaffPremises FROM MedicalNurseStaffPremises medicalNurseStaffPremises WHERE ";

	private static final String _SQL_COUNT_MEDICALNURSESTAFFPREMISES =
		"SELECT COUNT(medicalNurseStaffPremises) FROM MedicalNurseStaffPremises medicalNurseStaffPremises";

	private static final String _SQL_COUNT_MEDICALNURSESTAFFPREMISES_WHERE =
		"SELECT COUNT(medicalNurseStaffPremises) FROM MedicalNurseStaffPremises medicalNurseStaffPremises WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalNurseStaffPremises.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalNurseStaffPremises exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalNurseStaffPremises exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalNurseStaffPremisesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}