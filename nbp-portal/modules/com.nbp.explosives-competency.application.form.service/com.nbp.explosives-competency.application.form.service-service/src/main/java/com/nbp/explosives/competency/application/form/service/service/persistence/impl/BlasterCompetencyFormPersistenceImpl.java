/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchBlasterCompetencyFormException;
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyFormTable;
import com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormModelImpl;
import com.nbp.explosives.competency.application.form.service.service.persistence.BlasterCompetencyFormPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.BlasterCompetencyFormUtil;
import com.nbp.explosives.competency.application.form.service.service.persistence.impl.constants.EXPLOSIVEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the blaster competency form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BlasterCompetencyFormPersistence.class)
public class BlasterCompetencyFormPersistenceImpl
	extends BasePersistenceImpl<BlasterCompetencyForm>
	implements BlasterCompetencyFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BlasterCompetencyFormUtil</code> to access the blaster competency form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BlasterCompetencyFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetExplosiveById;
	private FinderPath _finderPathCountBygetExplosiveById;

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a matching blaster competency form could not be found
	 */
	@Override
	public BlasterCompetencyForm findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchBlasterCompetencyFormException {

		BlasterCompetencyForm blasterCompetencyForm = fetchBygetExplosiveById(
			explosivesApplicationId);

		if (blasterCompetencyForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosivesApplicationId=");
			sb.append(explosivesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchBlasterCompetencyFormException(sb.toString());
		}

		return blasterCompetencyForm;
	}

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	@Override
	public BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return fetchBygetExplosiveById(explosivesApplicationId, true);
	}

	/**
	 * Returns the blaster competency form where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching blaster competency form, or <code>null</code> if a matching blaster competency form could not be found
	 */
	@Override
	public BlasterCompetencyForm fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosivesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveById, finderArgs, this);
		}

		if (result instanceof BlasterCompetencyForm) {
			BlasterCompetencyForm blasterCompetencyForm =
				(BlasterCompetencyForm)result;

			if (explosivesApplicationId !=
					blasterCompetencyForm.getExplosivesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_BLASTERCOMPETENCYFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				List<BlasterCompetencyForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosivesApplicationId
								};
							}

							_log.warn(
								"BlasterCompetencyFormPersistenceImpl.fetchBygetExplosiveById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BlasterCompetencyForm blasterCompetencyForm = list.get(0);

					result = blasterCompetencyForm;

					cacheResult(blasterCompetencyForm);
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
			return (BlasterCompetencyForm)result;
		}
	}

	/**
	 * Removes the blaster competency form where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the blaster competency form that was removed
	 */
	@Override
	public BlasterCompetencyForm removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchBlasterCompetencyFormException {

		BlasterCompetencyForm blasterCompetencyForm = findBygetExplosiveById(
			explosivesApplicationId);

		return remove(blasterCompetencyForm);
	}

	/**
	 * Returns the number of blaster competency forms where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching blaster competency forms
	 */
	@Override
	public int countBygetExplosiveById(long explosivesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetExplosiveById;

		Object[] finderArgs = new Object[] {explosivesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BLASTERCOMPETENCYFORM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

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
		_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2 =
			"blasterCompetencyForm.explosivesApplicationId = ?";

	public BlasterCompetencyFormPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("state", "state_");

		setDBColumnNames(dbColumnNames);

		setModelClass(BlasterCompetencyForm.class);

		setModelImplClass(BlasterCompetencyFormImpl.class);
		setModelPKClass(long.class);

		setTable(BlasterCompetencyFormTable.INSTANCE);
	}

	/**
	 * Caches the blaster competency form in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForm the blaster competency form
	 */
	@Override
	public void cacheResult(BlasterCompetencyForm blasterCompetencyForm) {
		entityCache.putResult(
			BlasterCompetencyFormImpl.class,
			blasterCompetencyForm.getPrimaryKey(), blasterCompetencyForm);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveById,
			new Object[] {blasterCompetencyForm.getExplosivesApplicationId()},
			blasterCompetencyForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the blaster competency forms in the entity cache if it is enabled.
	 *
	 * @param blasterCompetencyForms the blaster competency forms
	 */
	@Override
	public void cacheResult(
		List<BlasterCompetencyForm> blasterCompetencyForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (blasterCompetencyForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BlasterCompetencyForm blasterCompetencyForm :
				blasterCompetencyForms) {

			if (entityCache.getResult(
					BlasterCompetencyFormImpl.class,
					blasterCompetencyForm.getPrimaryKey()) == null) {

				cacheResult(blasterCompetencyForm);
			}
		}
	}

	/**
	 * Clears the cache for all blaster competency forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BlasterCompetencyFormImpl.class);

		finderCache.clearCache(BlasterCompetencyFormImpl.class);
	}

	/**
	 * Clears the cache for the blaster competency form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BlasterCompetencyForm blasterCompetencyForm) {
		entityCache.removeResult(
			BlasterCompetencyFormImpl.class, blasterCompetencyForm);
	}

	@Override
	public void clearCache(List<BlasterCompetencyForm> blasterCompetencyForms) {
		for (BlasterCompetencyForm blasterCompetencyForm :
				blasterCompetencyForms) {

			entityCache.removeResult(
				BlasterCompetencyFormImpl.class, blasterCompetencyForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BlasterCompetencyFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				BlasterCompetencyFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		BlasterCompetencyFormModelImpl blasterCompetencyFormModelImpl) {

		Object[] args = new Object[] {
			blasterCompetencyFormModelImpl.getExplosivesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveById, args,
			blasterCompetencyFormModelImpl);
	}

	/**
	 * Creates a new blaster competency form with the primary key. Does not add the blaster competency form to the database.
	 *
	 * @param blasterCompetencyFormId the primary key for the new blaster competency form
	 * @return the new blaster competency form
	 */
	@Override
	public BlasterCompetencyForm create(long blasterCompetencyFormId) {
		BlasterCompetencyForm blasterCompetencyForm =
			new BlasterCompetencyFormImpl();

		blasterCompetencyForm.setNew(true);
		blasterCompetencyForm.setPrimaryKey(blasterCompetencyFormId);

		blasterCompetencyForm.setCompanyId(CompanyThreadLocal.getCompanyId());

		return blasterCompetencyForm;
	}

	/**
	 * Removes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm remove(long blasterCompetencyFormId)
		throws NoSuchBlasterCompetencyFormException {

		return remove((Serializable)blasterCompetencyFormId);
	}

	/**
	 * Removes the blaster competency form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the blaster competency form
	 * @return the blaster competency form that was removed
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm remove(Serializable primaryKey)
		throws NoSuchBlasterCompetencyFormException {

		Session session = null;

		try {
			session = openSession();

			BlasterCompetencyForm blasterCompetencyForm =
				(BlasterCompetencyForm)session.get(
					BlasterCompetencyFormImpl.class, primaryKey);

			if (blasterCompetencyForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBlasterCompetencyFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(blasterCompetencyForm);
		}
		catch (NoSuchBlasterCompetencyFormException noSuchEntityException) {
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
	protected BlasterCompetencyForm removeImpl(
		BlasterCompetencyForm blasterCompetencyForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(blasterCompetencyForm)) {
				blasterCompetencyForm = (BlasterCompetencyForm)session.get(
					BlasterCompetencyFormImpl.class,
					blasterCompetencyForm.getPrimaryKeyObj());
			}

			if (blasterCompetencyForm != null) {
				session.delete(blasterCompetencyForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (blasterCompetencyForm != null) {
			clearCache(blasterCompetencyForm);
		}

		return blasterCompetencyForm;
	}

	@Override
	public BlasterCompetencyForm updateImpl(
		BlasterCompetencyForm blasterCompetencyForm) {

		boolean isNew = blasterCompetencyForm.isNew();

		if (!(blasterCompetencyForm instanceof
				BlasterCompetencyFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(blasterCompetencyForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					blasterCompetencyForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in blasterCompetencyForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BlasterCompetencyForm implementation " +
					blasterCompetencyForm.getClass());
		}

		BlasterCompetencyFormModelImpl blasterCompetencyFormModelImpl =
			(BlasterCompetencyFormModelImpl)blasterCompetencyForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (blasterCompetencyForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				blasterCompetencyForm.setCreateDate(date);
			}
			else {
				blasterCompetencyForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!blasterCompetencyFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				blasterCompetencyForm.setModifiedDate(date);
			}
			else {
				blasterCompetencyForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(blasterCompetencyForm);
			}
			else {
				blasterCompetencyForm = (BlasterCompetencyForm)session.merge(
					blasterCompetencyForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BlasterCompetencyFormImpl.class, blasterCompetencyFormModelImpl,
			false, true);

		cacheUniqueFindersCache(blasterCompetencyFormModelImpl);

		if (isNew) {
			blasterCompetencyForm.setNew(false);
		}

		blasterCompetencyForm.resetOriginalValues();

		return blasterCompetencyForm;
	}

	/**
	 * Returns the blaster competency form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBlasterCompetencyFormException {

		BlasterCompetencyForm blasterCompetencyForm = fetchByPrimaryKey(
			primaryKey);

		if (blasterCompetencyForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBlasterCompetencyFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return blasterCompetencyForm;
	}

	/**
	 * Returns the blaster competency form with the primary key or throws a <code>NoSuchBlasterCompetencyFormException</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form
	 * @throws NoSuchBlasterCompetencyFormException if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm findByPrimaryKey(long blasterCompetencyFormId)
		throws NoSuchBlasterCompetencyFormException {

		return findByPrimaryKey((Serializable)blasterCompetencyFormId);
	}

	/**
	 * Returns the blaster competency form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param blasterCompetencyFormId the primary key of the blaster competency form
	 * @return the blaster competency form, or <code>null</code> if a blaster competency form with the primary key could not be found
	 */
	@Override
	public BlasterCompetencyForm fetchByPrimaryKey(
		long blasterCompetencyFormId) {

		return fetchByPrimaryKey((Serializable)blasterCompetencyFormId);
	}

	/**
	 * Returns all the blaster competency forms.
	 *
	 * @return the blaster competency forms
	 */
	@Override
	public List<BlasterCompetencyForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @return the range of blaster competency forms
	 */
	@Override
	public List<BlasterCompetencyForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of blaster competency forms
	 */
	@Override
	public List<BlasterCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<BlasterCompetencyForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the blaster competency forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BlasterCompetencyFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of blaster competency forms
	 * @param end the upper bound of the range of blaster competency forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of blaster competency forms
	 */
	@Override
	public List<BlasterCompetencyForm> findAll(
		int start, int end,
		OrderByComparator<BlasterCompetencyForm> orderByComparator,
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

		List<BlasterCompetencyForm> list = null;

		if (useFinderCache) {
			list = (List<BlasterCompetencyForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BLASTERCOMPETENCYFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BLASTERCOMPETENCYFORM;

				sql = sql.concat(BlasterCompetencyFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BlasterCompetencyForm>)QueryUtil.list(
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
	 * Removes all the blaster competency forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BlasterCompetencyForm blasterCompetencyForm : findAll()) {
			remove(blasterCompetencyForm);
		}
	}

	/**
	 * Returns the number of blaster competency forms.
	 *
	 * @return the number of blaster competency forms
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
					_SQL_COUNT_BLASTERCOMPETENCYFORM);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "blasterCompetencyFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BLASTERCOMPETENCYFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BlasterCompetencyFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the blaster competency form persistence.
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

		_finderPathFetchBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveById",
			new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, true);

		_finderPathCountBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveById", new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, false);

		BlasterCompetencyFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BlasterCompetencyFormUtil.setPersistence(null);

		entityCache.removeCache(BlasterCompetencyFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_BLASTERCOMPETENCYFORM =
		"SELECT blasterCompetencyForm FROM BlasterCompetencyForm blasterCompetencyForm";

	private static final String _SQL_SELECT_BLASTERCOMPETENCYFORM_WHERE =
		"SELECT blasterCompetencyForm FROM BlasterCompetencyForm blasterCompetencyForm WHERE ";

	private static final String _SQL_COUNT_BLASTERCOMPETENCYFORM =
		"SELECT COUNT(blasterCompetencyForm) FROM BlasterCompetencyForm blasterCompetencyForm";

	private static final String _SQL_COUNT_BLASTERCOMPETENCYFORM_WHERE =
		"SELECT COUNT(blasterCompetencyForm) FROM BlasterCompetencyForm blasterCompetencyForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"blasterCompetencyForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BlasterCompetencyForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BlasterCompetencyForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BlasterCompetencyFormPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"state"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}